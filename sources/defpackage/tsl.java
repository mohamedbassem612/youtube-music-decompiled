package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tsl implements AudioManager.OnAudioFocusChangeListener {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/common/tts/S3TextToSpeechController");
    public final ScheduledExecutorService b;
    public volatile tsj c;
    public final Executor d;
    public final List e;
    public volatile aqi f;
    public volatile String g;
    public volatile tsi h;
    public int i;
    public final dov j;
    private final tsj k;
    private final AudioManager l;
    private AudioFocusRequest m;
    private volatile tsg n;
    private final adbm o;
    private final qcb p;

    public tsl(Context context, ScheduledExecutorService scheduledExecutorService, aeiv aeivVar, awmd awmdVar, tsj tsjVar) {
        context.getClass();
        scheduledExecutorService.getClass();
        this.b = scheduledExecutorService;
        this.k = tsjVar;
        context.getApplicationContext().getClass();
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        this.l = (AudioManager) systemService;
        this.c = tsjVar;
        this.o = new adbm(context, awmdVar, this);
        this.p = new qcb(this, null);
        this.d = new ahfg(scheduledExecutorService);
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.e = copyOnWriteArrayList;
        this.j = dov.az();
        this.i = 2;
        this.g = "S3TextToSpeechController";
        copyOnWriteArrayList.add(aeivVar);
    }

    private final synchronized void i() {
        AudioFocusRequest audioFocusRequest = this.m;
        if (audioFocusRequest != null) {
            this.l.abandonAudioFocusRequest(audioFocusRequest);
        }
        this.m = null;
    }

    public final synchronized void a() {
        i();
        this.j.ab(new rme(new rla(this.g, 6), 19));
        tsi tsiVar = this.h;
        if (tsiVar != null) {
            tsiVar.e();
            tsiVar.c();
        }
        this.h = null;
        tsg tsgVar = this.n;
        if (tsgVar != null) {
            tsgVar.a();
        }
        this.n = null;
        aqi aqiVar = this.f;
        if (aqiVar != null) {
            aqiVar.b(Boolean.FALSE);
        }
        this.f = null;
    }

    public final synchronized void b() {
        i();
        this.j.ab(new tsd(new rla(this.g, 5), 3));
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((aeiv) it.next()).l(false, true, this.i);
        }
        aqi aqiVar = this.f;
        if (aqiVar != null) {
            aqiVar.b(Boolean.TRUE);
        }
        this.f = null;
        tsi tsiVar = this.h;
        if (tsiVar != null) {
            tsiVar.e();
            tsiVar.c();
        }
        this.h = null;
        tsg tsgVar = this.n;
        if (tsgVar != null) {
            tsgVar.a();
        }
        this.n = null;
    }

    public final synchronized void c(int i) {
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(i).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(1).build()).setOnAudioFocusChangeListener(this).build();
        this.m = audioFocusRequestBuild;
        this.l.requestAudioFocus(audioFocusRequestBuild);
    }

    public final void d(mgr mgrVar) {
        mgrVar.getClass();
        this.j.ac(mgrVar);
    }

    public final void e(mgr mgrVar) {
        mgrVar.getClass();
        this.j.ad(mgrVar);
    }

    public final synchronized void f(boolean z) {
        h(z);
    }

    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService] */
    /* JADX WARN: Type inference failed for: r8v0, types: [awmd, java.lang.Object] */
    public final synchronized void g(String str, String str2, int i, aqi aqiVar) {
        avbh avbhVarC;
        if (this.f == aqiVar) {
            this.j.ab(new tsd(new prq(15), 1));
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((aeiv) it.next()).m(this.i);
            }
            tsi tsiVar = new tsi(((tsl) this.p.a).b);
            if (this.f != aqiVar) {
                tsiVar.c();
                return;
            }
            this.h = tsiVar;
            tsk tskVar = new tsk(this, aqiVar, tsiVar, i);
            tsj tsjVar = this.c;
            if (tsjVar == null) {
                tsjVar = tsc.a;
            }
            tsj tsjVar2 = tsjVar;
            adbm adbmVar = this.o;
            tsg tsgVar = new tsg((Context) adbmVar.b, adbmVar.a, ((tsl) adbmVar.c).b, tskVar, tsjVar2);
            if (this.f != aqiVar) {
                tsgVar.a();
                tsiVar.e();
                tsiVar.c();
                this.h = null;
                i();
                return;
            }
            this.n = tsgVar;
            aihf aihfVarCreateBuilder = atyd.a.createBuilder();
            aihfVarCreateBuilder.getClass();
            aihfVarCreateBuilder.copyOnWrite();
            atyd atydVar = (atyd) aihfVarCreateBuilder.instance;
            atydVar.c |= 1;
            atydVar.d = str;
            String str3 = str2.length() == 0 ? "en-US" : str2;
            aihfVarCreateBuilder.copyOnWrite();
            atyd atydVar2 = (atyd) aihfVarCreateBuilder.instance;
            atydVar2.c |= 16;
            atydVar2.e = str3;
            String str4 = tsjVar2.d;
            if (str4.length() > 0) {
                aihfVarCreateBuilder.copyOnWrite();
                atyd atydVar3 = (atyd) aihfVarCreateBuilder.instance;
                atydVar3.c |= 32;
                atydVar3.f = str4;
            }
            aihfVarCreateBuilder.copyOnWrite();
            atyd atydVar4 = (atyd) aihfVarCreateBuilder.instance;
            atydVar4.c |= 65536;
            atydVar4.g = 24000;
            aihfVarCreateBuilder.copyOnWrite();
            atyd atydVar5 = (atyd) aihfVarCreateBuilder.instance;
            atydVar5.h = 1;
            atydVar5.c |= 131072;
            aihn aihnVarBuild = aihfVarCreateBuilder.build();
            aihnVarBuild.getClass();
            atxu atxuVar = atxu.a;
            aihh aihhVar = (aihh) atxuVar.createBuilder();
            aihhVar.getClass();
            aihhVar.copyOnWrite();
            atxu atxuVar2 = (atxu) aihhVar.instance;
            atxuVar2.b |= 1;
            atxuVar2.c = "synthesizer";
            atqn.c(aihhVar);
            aihl aihlVar = atxw.b;
            aihlVar.getClass();
            aihf aihfVarCreateBuilder2 = atxw.a.createBuilder();
            aihfVarCreateBuilder2.getClass();
            String string = UUID.randomUUID().toString();
            string.getClass();
            aihfVarCreateBuilder2.copyOnWrite();
            atxw atxwVar = (atxw) aihfVarCreateBuilder2.instance;
            atxwVar.c |= 1;
            atxwVar.d = string;
            aihn aihnVarBuild2 = aihfVarCreateBuilder2.build();
            aihnVarBuild2.getClass();
            aihhVar.e(aihlVar, (atxw) aihnVarBuild2);
            aihl aihlVar2 = atxt.b;
            aihlVar2.getClass();
            aihf aihfVarCreateBuilder3 = atxt.a.createBuilder();
            aihfVarCreateBuilder3.getClass();
            aihfVarCreateBuilder3.copyOnWrite();
            atxt atxtVar = (atxt) aihfVarCreateBuilder3.instance;
            atxtVar.c |= 1;
            atxtVar.d = "yt-readalong-android-client";
            aihfVarCreateBuilder3.copyOnWrite();
            atxt atxtVar2 = (atxt) aihfVarCreateBuilder3.instance;
            atxtVar2.c |= 4;
            atxtVar2.e = "Android";
            String str5 = Build.DISPLAY;
            str5.getClass();
            aihfVarCreateBuilder3.copyOnWrite();
            atxt atxtVar3 = (atxt) aihfVarCreateBuilder3.instance;
            atxtVar3.c |= 8;
            atxtVar3.f = str5;
            aihfVarCreateBuilder3.copyOnWrite();
            atxt atxtVar4 = (atxt) aihfVarCreateBuilder3.instance;
            atxtVar4.c |= 16;
            atxtVar4.g = "youtube-read-along";
            aihfVarCreateBuilder3.copyOnWrite();
            atxt atxtVar5 = (atxt) aihfVarCreateBuilder3.instance;
            atxtVar5.c |= SemanticState.Modal;
            atxtVar5.i = "PN:545560155980";
            String str6 = Build.MODEL;
            str6.getClass();
            aihfVarCreateBuilder3.copyOnWrite();
            atxt atxtVar6 = (atxt) aihfVarCreateBuilder3.instance;
            atxtVar6.c |= 64;
            atxtVar6.h = str6;
            aihn aihnVarBuild3 = aihfVarCreateBuilder3.build();
            aihnVarBuild3.getClass();
            aihhVar.e(aihlVar2, (atxt) aihnVarBuild3);
            aihh aihhVar2 = (aihh) atxuVar.createBuilder();
            aihhVar2.getClass();
            atqn.c(aihhVar2);
            aihl aihlVar3 = atyd.b;
            aihlVar3.getClass();
            aihhVar2.e(aihlVar3, (atyd) aihnVarBuild);
            aihh aihhVar3 = (aihh) atxuVar.createBuilder();
            aihhVar3.getClass();
            atqn.c(aihhVar3);
            aihhVar3.copyOnWrite();
            atxu atxuVar3 = (atxu) aihhVar3.instance;
            atxuVar3.b |= 8;
            atxuVar3.e = true;
            List listAL = atqq.aL(new atxu[]{atqn.b(aihhVar), atqn.b(aihhVar2), atqn.b(aihhVar3)});
            if (!tsgVar.e.get()) {
                aejn aejnVar = new aejn(tsgVar, 1);
                try {
                    if (oaj.a.compareAndSet(false, true)) {
                        ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
                        ExtensionRegistryLite extensionRegistryLite = avkl.a;
                        generatedRegistry.getClass();
                        avkl.a = generatedRegistry;
                    }
                    CronetEngine cronetEngine = (CronetEngine) tsgVar.b.io();
                    if (cronetEngine == null) {
                        throw new IllegalStateException("CronetEngine is not available");
                    }
                    long j = ahuz.a;
                    ytj ytjVar = new ytj(18);
                    long j2 = ahuz.a;
                    ahva ahvaVar = ahva.a;
                    if (ahvaVar == null) {
                        throw new NullPointerException("Null streamzWrapper");
                    }
                    Context context = tsgVar.a;
                    URI uriCreate = URI.create("https://speechs3proto2-pa.googleapis.com:443");
                    if (uriCreate == null) {
                        throw new NullPointerException("Null uri");
                    }
                    ?? r12 = tsgVar.c;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    ahuz ahuzVar = new ahuz(context, uriCreate, r12, r12, r12, r12, ytjVar, 300000L, 4194304, Long.MAX_VALUE, j2, ahvaVar);
                    qpj.b();
                    ahva ahvaVar2 = ahuzVar.i;
                    try {
                        Object obj = ((agfa) agev.i("")).a;
                        URI uri = ahuzVar.b;
                        auzo auzoVarV = auzo.v(uri.getHost(), uri.getPort(), cronetEngine);
                        auzoVarV.w((String) obj);
                        Executor executor = ahuzVar.d;
                        avhf avhfVar = auzoVarV.d;
                        if (executor != null) {
                            avhfVar.h = new avjx(executor, 1);
                        } else {
                            avhfVar.h = avhf.e;
                        }
                        Executor executor2 = ahuzVar.c;
                        if (executor2 != null) {
                            avhfVar.i = new avjx(executor2, 1);
                        } else {
                            avhfVar.i = avhf.e;
                        }
                        long j3 = ahuzVar.g;
                        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                        ahno.J(j3 > 0, "idle timeout is %s, but must be positive", j3);
                        if (j3 / 86400000 >= 30) {
                            avhfVar.r = -1L;
                        } else {
                            avhfVar.r = Math.max(j3, avhf.d);
                        }
                        auzoVarV.e = ahuzVar.h;
                        ScheduledExecutorService scheduledExecutorService = ahuzVar.e;
                        if (scheduledExecutorService != null) {
                            auzoVarV.b = scheduledExecutorService;
                        }
                        auyr auyrVarP = atxy.p(auzoVarV.u(), new oak(new avkv(ahuzVar.f, 1)));
                        if (cronetEngine.getClass().getName().equals("org.chromium.net.impl.JavaCronetEngine")) {
                            ahvaVar2.a();
                        } else {
                            ahvaVar2.a();
                        }
                        tsgVar.f = auyrVarP instanceof avax ? (avax) auyrVarP : null;
                        tsj tsjVar3 = tsgVar.d;
                        avbe avbeVar = new avbe();
                        avba avbaVar = avbe.b;
                        int i2 = avbb.c;
                        avbeVar.e(new avaz("X-Goog-Api-Key", avbaVar), tsjVar3.a);
                        avbeVar.e(new avaz("X-Android-Package", avbaVar), tsjVar3.b);
                        avbeVar.e(new avaz("X-Android-Cert", avbaVar), tsjVar3.c);
                        avko avkoVarA = avkm.a(new atxx(0), atxy.p(auyrVarP, new avkv(avbeVar, 0)));
                        auyr auyrVar = avkoVarA.a;
                        avbh avbhVar = atxy.a;
                        if (avbhVar == null) {
                            synchronized (atxy.class) {
                                try {
                                    avbhVarC = atxy.a;
                                    if (avbhVarC == null) {
                                        aeg aegVarC = avbh.c();
                                        aegVarC.e = avbg.d;
                                        aegVarC.d = avbh.b("speech.s3.S3StubbyClientConnectorService", "S3Bidi");
                                        aegVarC.d();
                                        atxu atxuVar4 = atxu.a;
                                        ExtensionRegistryLite extensionRegistryLite2 = avkl.a;
                                        aegVarC.c = new avkk(atxuVar4);
                                        aegVarC.b = new avkk(atxv.a);
                                        avbhVarC = aegVarC.c();
                                        atxy.a = avbhVarC;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            avbhVar = avbhVarC;
                        }
                        avkw avkwVarA = avks.a(auyrVar.a(avbhVar, avkoVarA.b), aejnVar);
                        if (!tsgVar.e.get()) {
                            Iterator it2 = listAL.iterator();
                            while (it2.hasNext()) {
                                avkwVarA.c((atxu) it2.next());
                            }
                            avkwVarA.a();
                            return;
                        }
                        avax avaxVar = tsgVar.f;
                        if (avaxVar != null) {
                            avaxVar.e();
                        }
                    } catch (ahuk e) {
                        ahvaVar2.a();
                        throw new IllegalStateException("Failed to load Cronet. If loading Cronet from GMS Core, consider using an OkHttp fallback", e);
                    } catch (Throwable th2) {
                        ahvaVar2.a();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    if (!tsgVar.e.get()) {
                        tsgVar.g.a(th3);
                    }
                }
            }
        }
    }

    public final void h(boolean z) {
        boolean z2;
        aqi aqiVar = this.f;
        if (aqiVar != null) {
            aqiVar.b(Boolean.FALSE);
            this.f = null;
            z2 = true;
        } else {
            z2 = false;
        }
        tsg tsgVar = this.n;
        if (tsgVar != null) {
            tsgVar.a();
            this.n = null;
            z2 = true;
        }
        tsi tsiVar = this.h;
        if (tsiVar != null) {
            tsiVar.e();
            tsiVar.c();
            this.h = null;
        } else if (!z2) {
            return;
        }
        i();
        this.j.ab(new rme(new prq(14), 20));
        for (aeiv aeivVar : this.e) {
            int i = this.i;
            if (z) {
                aeivVar.n(i);
            } else {
                aeivVar.l(true, false, i);
            }
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final synchronized void onAudioFocusChange(int i) {
        tsi tsiVar;
        try {
            if (i == -3 || i == -2) {
                tsi tsiVar2 = this.h;
                if (tsiVar2 != null) {
                    tsiVar2.d(0.2f);
                }
            } else if (i == -1) {
                f(false);
            } else if (i == 1 && (tsiVar = this.h) != null) {
                tsiVar.d(1.0f);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
