package defpackage;

import j$.time.Duration;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qur extends quq {
    public qwo b;
    public Duration c;
    public boolean d;
    public float e;

    private qur(qur qurVar) {
        super(qurVar);
        this.c = Duration.ZERO;
        this.e = 1.0f;
        this.b = qurVar.b;
        this.c = qurVar.c;
        this.d = qurVar.d;
        this.e = qurVar.e;
    }

    @Override // defpackage.qus
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qus clone() {
        return new qur(this);
    }

    @Override // defpackage.qus
    public final /* synthetic */ Object clone() {
        return new qur(this);
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "{sourceUri: %s, sourceStartTime: %s, volume: %f, enableLooping: %b, playbackRate: %f, automation: %s}", this.b.a(), this.c, Double.valueOf(((quq) this).a), Boolean.valueOf(this.d), Float.valueOf(this.e), null);
    }

    private qur() {
        this.c = Duration.ZERO;
        this.e = 1.0f;
    }

    public qur(qwo qwoVar) {
        this.c = Duration.ZERO;
        this.e = 1.0f;
        this.b = qwoVar;
    }
}
