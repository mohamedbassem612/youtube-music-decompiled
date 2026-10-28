package defpackage;

import j$.util.Optional;
import java.util.Locale;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rbc {
    public Throwable a;
    final /* synthetic */ rbm b;
    private final rbd c;
    private boolean d = false;

    public rbc(rbm rbmVar, rbd rbdVar) {
        this.b = rbmVar;
        this.c = rbdVar;
    }

    public final synchronized void a(String str, Object... objArr) {
        Level level;
        String strValueOf;
        String str2;
        rbf rbfVar = rbf.a;
        rbd rbdVar = this.c;
        if (rbdVar == rbd.b) {
            return;
        }
        rbm rbmVar = this.b;
        Object obj = rbmVar.b;
        if (this.d) {
            rbf rbfVar2 = rbf.a;
            Throwable th = this.a;
            if (!rbfVar2.a()) {
                audb audbVar = rbfVar2.c;
                audc audcVar = rbfVar2.d;
                if (audbVar != null || audcVar != null) {
                    aihf aihfVarCreateBuilder = obj == null ? auet.a.createBuilder() : ((aihn) obj).toBuilder();
                    if (audbVar != null) {
                        aihfVarCreateBuilder.copyOnWrite();
                        auet auetVar = (auet) aihfVarCreateBuilder.instance;
                        auetVar.c = audbVar.j;
                        auetVar.b |= 1;
                    }
                    if (audcVar != null) {
                        aihfVarCreateBuilder.copyOnWrite();
                        auet auetVar2 = (auet) aihfVarCreateBuilder.instance;
                        auetVar2.d = audcVar.p;
                        auetVar2.b |= 2;
                    }
                    obj = (auet) aihfVarCreateBuilder.build();
                }
                rbe rbeVar = rbfVar2.b;
                rbeVar.getClass();
                String strConcat = String.format(Locale.US, str, objArr);
                ajtv ajtvVar = (ajtv) udk.a.getOrDefault(rbdVar, ajtv.ERROR_LEVEL_WARNING);
                zvl zvlVar = ((udk) rbeVar).c;
                if (zvlVar == null) {
                    if (obj != null) {
                        audc audcVarA = audc.a(((auet) obj).d);
                        if (audcVarA == null) {
                            audcVarA = audc.MEDIA_ENGINE_CLIENT_SURFACE_UNKNOWN;
                        }
                        switch (audcVarA.ordinal()) {
                            case 1:
                                strValueOf = String.valueOf(strConcat);
                                str2 = "[ME_SURFACE_CAMERA]";
                                strConcat = str2.concat(strValueOf);
                                break;
                            case 2:
                                strValueOf = String.valueOf(strConcat);
                                str2 = "[ME_SURFACE_EDITOR]";
                                strConcat = str2.concat(strValueOf);
                                break;
                            case 3:
                                strValueOf = String.valueOf(strConcat);
                                str2 = "[ME_SURFACE_RECOMP]";
                                strConcat = str2.concat(strValueOf);
                                break;
                            case 4:
                                strValueOf = String.valueOf(strConcat);
                                str2 = "[ME_SURFACE_EXPORT_SESSION]";
                                strConcat = str2.concat(strValueOf);
                                break;
                            case 5:
                                strValueOf = String.valueOf(strConcat);
                                str2 = "[ME_SURFACE_UPLOAD_TRANSCODE]";
                                strConcat = str2.concat(strValueOf);
                                break;
                            case 6:
                                strValueOf = String.valueOf(strConcat);
                                str2 = "[ME_SURFACE_AUDIO_UPLOAD_TRANSCODE]";
                                strConcat = str2.concat(strValueOf);
                                break;
                            case 7:
                                strValueOf = String.valueOf(strConcat);
                                str2 = "[ME_SURFACE_CLIP_TRIM]";
                                strConcat = str2.concat(strValueOf);
                                break;
                            case 8:
                                strValueOf = String.valueOf(strConcat);
                                str2 = "[ME_SURFACE_DENOISE]";
                                strConcat = str2.concat(strValueOf);
                                break;
                            case 9:
                                strValueOf = String.valueOf(strConcat);
                                str2 = "[ME_SURFACE_MEDIAGEN]";
                                strConcat = str2.concat(strValueOf);
                                break;
                            case 10:
                                strValueOf = String.valueOf(strConcat);
                                str2 = "[ME_SURFACE_LICENSED_MUSIC_TRANSMUX]";
                                strConcat = str2.concat(strValueOf);
                                break;
                            case 11:
                                strValueOf = String.valueOf(strConcat);
                                str2 = "[ME_SURFACE_VIDEO_REVERSE]";
                                strConcat = str2.concat(strValueOf);
                                break;
                            case 12:
                                strValueOf = String.valueOf(strConcat);
                                str2 = "[ME_SURFACE_IMPORT]";
                                strConcat = str2.concat(strValueOf);
                                break;
                            case 13:
                                strValueOf = String.valueOf(strConcat);
                                str2 = "[ME_SURFACE_EDITOR_SAVE_TO_DEVICE]";
                                strConcat = str2.concat(strValueOf);
                                break;
                            case 14:
                                strValueOf = String.valueOf(strConcat);
                                str2 = "[ME_SURFACE_AIM_PREPROCESS]";
                                strConcat = str2.concat(strValueOf);
                                break;
                        }
                    }
                    zvm zvmVar = ((udk) rbeVar).e;
                    zvn zvnVar = (zvn) udk.b.get(ajtvVar);
                    zvnVar.getClass();
                    if (th == null) {
                        zvp.a(zvnVar, zvmVar, strConcat);
                    } else {
                        zvp.b(zvnVar, zvmVar, strConcat, th);
                    }
                } else {
                    zvj zvjVarA = zvk.a();
                    zvjVarA.c(ajtvVar);
                    zvjVarA.d(strConcat);
                    zvjVarA.i = ajtvVar == ajtv.ERROR_LEVEL_ERROR ? 138 : 137;
                    zvjVarA.j = 41;
                    if (obj != null) {
                        zvjVarA.e = Optional.of((aned) ufk.a.b(obj));
                    }
                    if (th != null) {
                        zvjVarA.f(th);
                    }
                    zvlVar.a(zvjVarA.a());
                }
            }
        }
        int iOrdinal = rbdVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            level = Level.INFO;
        } else if (iOrdinal == 2) {
            level = Level.WARNING;
        } else {
            if (iOrdinal != 3 && iOrdinal != 4) {
                throw new RuntimeException(null, null);
            }
            level = Level.SEVERE;
        }
        Throwable th2 = this.a;
        if (th2 == null) {
            ((agrc) ((agrf) rbmVar.a).a(level).k("com/google/android/libraries/video/mediaengine/logging/Logger$Api", "log", 152, "Logger.java")).I(str, objArr);
            rbm.b(level, this.a, str, objArr);
        } else {
            ((agrc) ((agrc) ((agrf) rbmVar.a).a(level).j(th2)).k("com/google/android/libraries/video/mediaengine/logging/Logger$Api", "log", 155, "Logger.java")).I(str, objArr);
            rbm.b(level, this.a, str, objArr);
        }
    }

    public final synchronized void b(andu anduVar) {
        rbf rbfVar = rbf.a;
        if (!rbfVar.a()) {
            rbe rbeVar = rbfVar.b;
            rbeVar.getClass();
            xeu xeuVar = ((udk) rbeVar).d;
            if (xeuVar != null) {
                if (xeuVar.b) {
                    xff xffVarA = xeuVar.a(anduVar, alot.MDE_PLAYER_PERFORMANCE_METRICS);
                    ztf ztfVar = xffVarA.k.e;
                    xffVarA.l = ztfVar.a();
                    ztfVar.k(xffVarA);
                    return;
                }
                alos alosVar = (alos) alou.a.createBuilder();
                alosVar.copyOnWrite();
                alou alouVar = (alou) alosVar.instance;
                anduVar.getClass();
                alouVar.d = anduVar;
                alouVar.c = 472;
                xeuVar.b((alou) alosVar.build());
            }
        }
    }

    public final void c() {
        this.d = true;
    }

    public final void d(String str, Object... objArr) {
        this.a = new IllegalStateException(String.format(Locale.US, str, objArr));
    }
}
