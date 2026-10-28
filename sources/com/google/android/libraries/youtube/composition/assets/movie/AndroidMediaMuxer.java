package com.google.android.libraries.youtube.composition.assets.movie;

import com.google.android.libraries.youtube.composition.common.types.StatusOr;
import com.google.android.libraries.youtube.media.interfaces.Time;
import io.grpc.Status;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AndroidMediaMuxer {
    public abstract StatusOr addTrack(AndroidMediaFormat androidMediaFormat);

    public abstract Status close();

    public abstract Status writeSampleData(int i, ByteBuffer byteBuffer, Time time, int i2);
}
