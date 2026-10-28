package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tsk {
    public boolean a;
    public final /* synthetic */ tsl b;
    public final /* synthetic */ aqi c;
    public final /* synthetic */ int d;
    public final /* synthetic */ tsi e;

    public tsk(tsl tslVar, aqi aqiVar, tsi tsiVar, int i) {
        this.b = tslVar;
        this.c = aqiVar;
        this.e = tsiVar;
        this.d = i;
    }

    public final void a(Throwable th) {
        ((agrc) ((agrc) tsl.a.b().i(agso.a, "S3TextToSpeechControlle")).j(th).k("com/google/android/libraries/youtube/common/tts/S3TextToSpeechController$startSpeaking$<anonymous>", "onError", 384, "S3TextToSpeechController.kt")).w("S3 TTS Error: %s", th.getMessage());
        tsl tslVar = this.b;
        tslVar.d.execute(afwl.i(new sxk(tslVar, this.c, 15, null)));
    }
}
