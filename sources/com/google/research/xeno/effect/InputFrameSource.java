package com.google.research.xeno.effect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum InputFrameSource {
    BACK_CAMERA(0),
    FRONT_CAMERA_MIRRORED(1),
    FRONT_CAMERA_NONMIRRORED(2),
    VIDEO(3);

    public final int e;

    InputFrameSource(int i) {
        this.e = i;
    }
}
