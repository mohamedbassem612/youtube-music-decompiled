package androidx.car.app.media.model;

import androidx.car.app.model.CarColor;
import defpackage.yf;
import defpackage.zh;
import defpackage.zi;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class MediaPlaybackStyle {
    private final CarColor mMediaAccentColor;
    private final int mProgressBarStrokeCap;

    private MediaPlaybackStyle(zh zhVar) {
        Object obj = zhVar.b;
        this.mMediaAccentColor = null;
        int i = zhVar.a;
        this.mProgressBarStrokeCap = 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaPlaybackStyle) {
            MediaPlaybackStyle mediaPlaybackStyle = (MediaPlaybackStyle) obj;
            if (Objects.equals(this.mMediaAccentColor, mediaPlaybackStyle.mMediaAccentColor) && this.mProgressBarStrokeCap == mediaPlaybackStyle.mProgressBarStrokeCap) {
                return true;
            }
        }
        return false;
    }

    public CarColor getMediaAccentColor() {
        return this.mMediaAccentColor;
    }

    public int getProgressBarStrokeCap() {
        return this.mProgressBarStrokeCap;
    }

    public int hashCode() {
        return Objects.hash(this.mMediaAccentColor, Integer.valueOf(this.mProgressBarStrokeCap));
    }

    public String toString() {
        return "MediaPlaybackStyle{mediaAccentColor=" + this.mMediaAccentColor + ", progressBarStrokeCap=" + this.mProgressBarStrokeCap + '}';
    }

    /* synthetic */ MediaPlaybackStyle(zh zhVar, zi ziVar) {
        this(zhVar);
    }

    private MediaPlaybackStyle() {
        this.mMediaAccentColor = null;
        this.mProgressBarStrokeCap = 0;
    }
}
