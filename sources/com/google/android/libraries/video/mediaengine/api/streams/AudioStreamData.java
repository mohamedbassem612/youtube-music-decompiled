package com.google.android.libraries.video.mediaengine.api.streams;

import j$.time.Duration;
import j$.util.Objects;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class AudioStreamData {
    private final ByteBuffer a;
    private final Duration b;

    static {
        ByteBuffer.allocate(0);
        Duration duration = Duration.ZERO;
    }

    private AudioStreamData(ByteBuffer byteBuffer, Duration duration) {
        this.a = byteBuffer;
        this.b = duration;
    }

    public static AudioStreamData create(ByteBuffer byteBuffer, Duration duration) {
        return new AudioStreamData(byteBuffer, duration);
    }

    public ByteBuffer audioBuffer() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AudioStreamData) {
            AudioStreamData audioStreamData = (AudioStreamData) obj;
            if (this.a.equals(audioStreamData.a) && this.b.equals(audioStreamData.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public Duration timestamp() {
        return this.b;
    }
}
