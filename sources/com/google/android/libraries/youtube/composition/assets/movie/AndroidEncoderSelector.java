package com.google.android.libraries.youtube.composition.assets.movie;

import com.google.android.libraries.youtube.composition.common.types.StatusOr;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AndroidEncoderSelector {
    public abstract ArrayList getSupportedAudioCodecDebugInfo();

    public abstract ArrayList getSupportedVideoCodecDebugInfo();

    public abstract ArrayList getSupportedVideoEncoders(AndroidMediaFormat androidMediaFormat);

    public abstract StatusOr selectAudioEncoder(AndroidMediaFormat androidMediaFormat);
}
