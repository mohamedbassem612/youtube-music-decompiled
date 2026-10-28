package com.google.android.libraries.youtube.composition.assets.movie;

import com.google.android.libraries.youtube.composition.common.types.StatusOr;
import com.google.android.libraries.youtube.media.interfaces.Time;
import io.grpc.Status;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AndroidMediaExtractor {
    public abstract boolean advance();

    public abstract StatusOr getSampleMetadata();

    public abstract ArrayList listTracks();

    public abstract Status readSample(ByteBuffer byteBuffer);

    public abstract void release();

    public abstract Status seekTo(Time time);

    public abstract void selectTrack(int i);

    public abstract Status setDataSource(String str);
}
