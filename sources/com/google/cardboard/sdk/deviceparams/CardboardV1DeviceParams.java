package com.google.cardboard.sdk.deviceparams;

import com.google.cardboard.proto.CardboardDevice;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class CardboardV1DeviceParams {
    public static final float CARDBOARD_V1_INTER_LENS_DISTANCE = 0.06f;
    public static final String CARDBOARD_V1_MODEL = "Cardboard v1";
    public static final float CARDBOARD_V1_SCREEN_TO_LENS_DISTANCE = 0.042f;
    public static final float CARDBOARD_V1_TRAY_TO_LENS_CENTER_DISTANCE = 0.035f;
    public static final String CARDBOARD_V1_VENDOR = "Google, Inc.";
    public static final CardboardDevice.DeviceParams.ButtonType CARDBOARD_V1_PRIMARY_BUTTON_TYPE = CardboardDevice.DeviceParams.ButtonType.MAGNET;
    public static final CardboardDevice.DeviceParams.VerticalAlignmentType CARDBOARD_V1_VERTICAL_ALIGNMENT_TYPE = CardboardDevice.DeviceParams.VerticalAlignmentType.BOTTOM;
    public static final float[] CARDBOARD_V1_DISTORTION_COEFFS = {0.441f, 0.156f};
    public static final float[] CARDBOARD_V1_FOV_ANGLES = {40.0f, 40.0f, 40.0f, 40.0f};

    private CardboardV1DeviceParams() {
    }

    public static CardboardDevice.DeviceParams build() {
        CardboardDevice.DeviceParams.Builder builderNewBuilder = CardboardDevice.DeviceParams.newBuilder();
        builderNewBuilder.setVendor(CARDBOARD_V1_VENDOR);
        builderNewBuilder.setModel(CARDBOARD_V1_MODEL);
        builderNewBuilder.setPrimaryButton(CARDBOARD_V1_PRIMARY_BUTTON_TYPE);
        builderNewBuilder.setScreenToLensDistance(0.042f);
        builderNewBuilder.setInterLensDistance(0.06f);
        builderNewBuilder.setVerticalAlignment(CARDBOARD_V1_VERTICAL_ALIGNMENT_TYPE);
        builderNewBuilder.setTrayToLensDistance(0.035f);
        for (float f : CARDBOARD_V1_DISTORTION_COEFFS) {
            builderNewBuilder.addDistortionCoefficients(f);
        }
        for (float f2 : CARDBOARD_V1_FOV_ANGLES) {
            builderNewBuilder.addLeftEyeFieldOfViewAngles(f2);
        }
        return (CardboardDevice.DeviceParams) builderNewBuilder.build();
    }
}
