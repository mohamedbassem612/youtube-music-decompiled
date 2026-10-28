package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class mgr {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ nsl c;
    final /* synthetic */ mgs d;
    final /* synthetic */ avpr e;
    final /* synthetic */ acyw f;

    public mgr(mgs mgsVar, String str, avpr avprVar, int i, acyw acywVar, nsl nslVar) {
        this.a = str;
        this.e = avprVar;
        this.b = i;
        this.f = acywVar;
        this.c = nslVar;
        this.d = mgsVar;
    }

    public final void a(String str) {
        if (str.equals(this.a) || str.equals("S3TextToSpeechController")) {
            avpr avprVar = this.e;
            if (avprVar.f() || mgs.a.get() != this.b) {
                return;
            }
            avprVar.a();
            this.f.b();
        }
    }

    public final void b(String str, int i) {
        if (mgs.a.get() != this.b) {
            this.f.e(this);
            return;
        }
        avpr avprVar = this.e;
        if (avprVar.f()) {
            return;
        }
        mgs mgsVar = this.d;
        mgsVar.c.c(aslh.LOG_LEVEL_WARN, this.c, "TTS utterance failed: utteranceId=%s, errorCode=%d", str, Integer.valueOf(i));
        this.f.b();
        avprVar.a();
    }

    public final void c() {
        if (mgs.a.get() != this.b) {
            this.f.e(this);
            return;
        }
        avpr avprVar = this.e;
        if (avprVar.f()) {
            return;
        }
        avprVar.a();
    }
}
