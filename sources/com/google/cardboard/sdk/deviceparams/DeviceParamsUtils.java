package com.google.cardboard.sdk.deviceparams;

import android.util.Log;
import com.google.cardboard.proto.CardboardDevice;
import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aiik;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class DeviceParamsUtils {
    private static final String TAG = "DeviceParamsUtils";

    private DeviceParamsUtils() {
    }

    public static CardboardDevice.DeviceParams parseCardboardDeviceParams(byte[] bArr) {
        try {
            return CardboardDevice.DeviceParams.parseFrom(bArr, ExtensionRegistryLite.a);
        } catch (aiik e) {
            Log.w(TAG, "Parsing cardboard parameters from buffer failed: ".concat(e.toString()));
            return null;
        }
    }
}
