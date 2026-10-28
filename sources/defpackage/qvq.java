package defpackage;

import j$.time.Duration;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qvq extends qvu {
    public static final Duration a = Duration.ZERO;
    public qwo b;
    public Duration c;
    public double d;
    public boolean e;
    public float f;

    private qvq(qvq qvqVar) {
        super(qvqVar);
        this.c = a;
        this.d = 1.0d;
        this.e = false;
        this.f = 1.0f;
        this.b = qvqVar.b;
        this.c = qvqVar.c;
        this.d = qvqVar.d;
        this.e = qvqVar.e;
        this.f = qvqVar.f;
    }

    @Override // defpackage.qvu
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qvu clone() {
        return new qvq(this);
    }

    @Override // defpackage.qvu
    public final /* synthetic */ Object clone() {
        return new qvq(this);
    }

    @Override // defpackage.qvu
    public final String toString() {
        return String.format(Locale.US, "AudioSegment{%s, sourceUri: %s, sourceStartTime: %s, volume: %s, enableLooping: %b, playbackRate: %s, automation: %s}", super.toString(), this.b.a(), this.c, Double.valueOf(this.d), Boolean.valueOf(this.e), Float.valueOf(this.f), null);
    }

    public qvq(qwo qwoVar) {
        this.c = a;
        this.d = 1.0d;
        this.e = false;
        this.f = 1.0f;
        this.b = qwoVar;
    }
}
