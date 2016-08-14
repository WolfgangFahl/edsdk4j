package probe;

import java.io.IOException;

import edsdk.api.CanonCamera;
import edsdk.utils.CanonConstants.EdsCompressQuality;
import edsdk.utils.CanonConstants.EdsImageSize;
import edsdk.utils.CanonConstants.EdsImageType;
import edsdk.utils.CanonConstants.EdsPropertyID;

/**
 * 
 * Copyright © 2014 Hansi Raber <super@superduper.org>, Ananta Palani
 * <anantapalani@gmail.com>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the COPYING file for more details.
 * 
 * @author hansi
 * @author Ananta Palani
 * 
 */
public class CameraImageQuality {

    public static void main( final String[] args ) throws InterruptedException, IOException {
        final CanonCamera camera = new CanonCamera();
        camera.openSession();

        final long imageQuality = camera.getProperty( EdsPropertyID.kEdsPropID_ImageQuality );

        /*
         * kEdsPropID_ImageQuality
         * Bit num. Description Value
         * ----------------------------------------------------------------------
         * ----------------------------------
         * 24-31 Image Size of the main image Values defined in enum
         * EdsImageSize
         * 20-23 Image Format of the main image Values defined in enum
         * EdsImageType
         * 16-19 Image Compress Quality of the main image Values defined in enum
         * EdsImageCompressQuality
         * 12-15 reserved
         * 8-11 Image Size of the secondary image Values defined in enum
         * EdsImageSize
         * 4-7 Image Format of the secondary image Values defined in enum
         * EdsImageType
         * 0-3 Image Compress Quality of the secondary image Values defined in
         * enum EdsImageCompressQuality
         */
        final EdsImageSize mainImageSize = EdsImageSize.enumOfValue( (int) ( imageQuality >>> 24 & 0xf ) );
        final EdsImageType mainImageType = EdsImageType.enumOfValue( (int) ( imageQuality >>> 20 & 0xf ) );
        final EdsCompressQuality mainImageCompressQuality = EdsCompressQuality.enumOfValue( (int) ( imageQuality >>> 16 & 0xf ) );
        final EdsImageSize secondaryImageSize = EdsImageSize.enumOfValue( (int) ( imageQuality >>> 8 & 0xf ) );
        final EdsImageType secondaryImageType = EdsImageType.enumOfValue( (int) ( imageQuality >>> 4 & 0xf ) );
        final EdsCompressQuality secondaryImageCompressQuality = EdsCompressQuality.enumOfValue( (int) ( imageQuality & 0xf ) );

        camera.closeSession();
        CanonCamera.close();

        System.out.println();
        System.out.println( "Main image properties " );
        System.out.println( "                type: " +
                            mainImageType.description() );
        System.out.println( "                size: " +
                            mainImageSize.description() );
        System.out.println( " compression quality: " +
                            mainImageCompressQuality.description() );
        System.out.println();
        System.out.println( "Secondary image properties " );
        System.out.println( "                type: " +
                            secondaryImageType.description() );
        System.out.println( "                size: " +
                            secondaryImageSize.description() );
        System.out.println( " compression quality: " +
                            secondaryImageCompressQuality.description() );
    }

}
