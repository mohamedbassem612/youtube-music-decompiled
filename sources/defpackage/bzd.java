package defpackage;

import android.net.Uri;
import com.google.android.apps.youtube.proto.ClientAbrStateOuterClass$ClientAbrState;
import com.google.protos.youtube.api.innertube.MediaCommonConfigOuterClass$MediaCommonConfig;
import com.google.protos.youtube.api.innertube.MediaCommonConfigOuterClass$MediaUstreamerRequestConfig;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bzd implements bye {
    private final bye a;
    private final bzc b;
    private boolean c;

    public bzd(bye byeVar, bzc bzcVar) {
        this.a = byeVar;
        this.b = bzcVar;
    }

    @Override // defpackage.brv
    public final int a(byte[] bArr, int i, int i2) {
        return this.a.a(bArr, i, i2);
    }

    @Override // defpackage.bye
    public final long b(byi byiVar) {
        Long l;
        int i;
        byi byiVarA = byiVar;
        zef zefVar = (zef) this.b;
        wiu wiuVar = zefVar.b;
        aoqd aoqdVar = wiuVar.d;
        MediaCommonConfigOuterClass$MediaCommonConfig defaultInstance = aoqdVar.e;
        if (defaultInstance == null) {
            defaultInstance = MediaCommonConfigOuterClass$MediaCommonConfig.getDefaultInstance();
        }
        MediaCommonConfigOuterClass$MediaUstreamerRequestConfig defaultInstance2 = defaultInstance.d;
        if (defaultInstance2 == null) {
            defaultInstance2 = MediaCommonConfigOuterClass$MediaUstreamerRequestConfig.getDefaultInstance();
        }
        if (defaultInstance2.c) {
            Uri uri = byiVarA.a;
            if ("/videoplayback".equals(uri.getPath())) {
                if (byiVarA.e != null) {
                    zvp.a(zvn.b, zvm.f, "AbrStateDataSpec: Unexpected http body.");
                }
                Object objA = byiVarA.l;
                Long l2 = null;
                byte[] byteArray = null;
                if (true != (objA instanceof ypq)) {
                    objA = null;
                }
                MediaCommonConfigOuterClass$MediaCommonConfig defaultInstance3 = aoqdVar.e;
                if (defaultInstance3 == null) {
                    defaultInstance3 = MediaCommonConfigOuterClass$MediaCommonConfig.getDefaultInstance();
                }
                MediaCommonConfigOuterClass$MediaUstreamerRequestConfig defaultInstance4 = defaultInstance3.d;
                if (defaultInstance4 == null) {
                    defaultInstance4 = MediaCommonConfigOuterClass$MediaUstreamerRequestConfig.getDefaultInstance();
                }
                if (defaultInstance4.f) {
                    if (objA == null) {
                        objA = ypq.a().a();
                    }
                    ypp yppVar = new ypp((ypq) objA);
                    yppVar.d(true);
                    objA = yppVar.a();
                }
                if (zefVar.e.cI()) {
                    if (objA == null) {
                        ypp yppVarA = ypq.a();
                        yppVarA.j(tok.MEDIA_PLAYER_ABR_STATE_RESOLVER);
                        objA = yppVarA.a();
                    } else {
                        ypq ypqVar = (ypq) objA;
                        if (ypqVar.i.isEmpty()) {
                            ypp yppVar2 = new ypp(ypqVar);
                            yppVar2.j(tok.MEDIA_PLAYER_ABR_STATE_RESOLVER);
                            objA = yppVar2.a();
                        }
                    }
                }
                Object obj = objA;
                if (yno.aA(wiuVar, byiVarA, zefVar.h)) {
                    zefVar.d.w("ppp", "asr");
                    zefVar.h = zefVar.f;
                }
                MediaCommonConfigOuterClass$MediaCommonConfig defaultInstance5 = aoqdVar.e;
                if (defaultInstance5 == null) {
                    defaultInstance5 = MediaCommonConfigOuterClass$MediaCommonConfig.getDefaultInstance();
                }
                MediaCommonConfigOuterClass$MediaUstreamerRequestConfig defaultInstance6 = defaultInstance5.d;
                if (defaultInstance6 == null) {
                    defaultInstance6 = MediaCommonConfigOuterClass$MediaUstreamerRequestConfig.getDefaultInstance();
                }
                if (defaultInstance6.e) {
                    i = 2;
                } else {
                    if (obj != null) {
                        ypq ypqVar2 = (ypq) obj;
                        l = ypqVar2.a;
                        l2 = ypqVar2.d;
                    } else {
                        l = null;
                    }
                    aihf aihfVarCreateBuilder = jrt.a.createBuilder(zefVar.i.s(zefVar.g));
                    zeh zehVar = zefVar.c;
                    aigj aigjVarB = zehVar.b();
                    if (aigjVarB != null) {
                        aihfVarCreateBuilder.copyOnWrite();
                        jrt jrtVar = (jrt) aihfVarCreateBuilder.instance;
                        jrtVar.b |= 8;
                        jrtVar.e = aigjVarB;
                    }
                    aihf aihfVarCreateBuilder2 = jrb.a.createBuilder();
                    i = 2;
                    ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrStateA = zehVar.a(wiuVar, -1, -1, l2 != null ? l2.longValue() : -9223372036854775807L, zefVar.f, 0.0f, agpi.a, null);
                    aihfVarCreateBuilder2.copyOnWrite();
                    jrb jrbVar = (jrb) aihfVarCreateBuilder2.instance;
                    clientAbrStateOuterClass$ClientAbrStateA.getClass();
                    jrbVar.c = clientAbrStateOuterClass$ClientAbrStateA;
                    jrbVar.b |= 1;
                    jrt jrtVar2 = (jrt) aihfVarCreateBuilder.build();
                    aihfVarCreateBuilder2.copyOnWrite();
                    jrb jrbVar2 = (jrb) aihfVarCreateBuilder2.instance;
                    jrtVar2.getClass();
                    jrbVar2.f = jrtVar2;
                    jrbVar2.b |= 8;
                    if ((wiuVar.E().b & 2) != 0) {
                        MediaCommonConfigOuterClass$MediaUstreamerRequestConfig defaultInstance7 = wiuVar.E().d;
                        if (defaultInstance7 == null) {
                            defaultInstance7 = MediaCommonConfigOuterClass$MediaUstreamerRequestConfig.getDefaultInstance();
                        }
                        if ((defaultInstance7.b & 4) != 0) {
                            MediaCommonConfigOuterClass$MediaUstreamerRequestConfig defaultInstance8 = wiuVar.E().d;
                            if (defaultInstance8 == null) {
                                defaultInstance8 = MediaCommonConfigOuterClass$MediaUstreamerRequestConfig.getDefaultInstance();
                            }
                            aigj aigjVar = defaultInstance8.d;
                            aihfVarCreateBuilder2.copyOnWrite();
                            jrb jrbVar3 = (jrb) aihfVarCreateBuilder2.instance;
                            aigjVar.getClass();
                            jrbVar3.b |= 2;
                            jrbVar3.d = aigjVar;
                        }
                    }
                    if (wiuVar.am() && l != null && l.longValue() != -9223372036854775807L) {
                        long jLongValue = l.longValue();
                        aihfVarCreateBuilder2.copyOnWrite();
                        jrb jrbVar4 = (jrb) aihfVarCreateBuilder2.instance;
                        jrbVar4.b |= 4;
                        jrbVar4.e = jLongValue;
                    }
                    byteArray = ((jrb) aihfVarCreateBuilder2.build()).toByteArray();
                }
                byh byhVar = new byh();
                byhVar.a = uri;
                byhVar.d = i;
                byhVar.e = byteArray;
                byhVar.b = byiVarA.b;
                byhVar.g = byiVarA.h;
                byhVar.h = byiVarA.i;
                byhVar.i = byiVarA.j;
                byhVar.j = byiVarA.k;
                byhVar.f = zef.a;
                byhVar.k = obj;
                byiVarA = byhVar.a();
            } else {
                byiVarA = new byi(uri, byiVarA.b, byiVarA.c, byiVarA.d, byiVarA.e, zef.a, byiVarA.h, byiVarA.i, byiVarA.j, byiVarA.k, byiVarA.l);
            }
        }
        this.c = 1;
        return this.a.b(byiVarA);
    }

    @Override // defpackage.bye
    public final Uri c() {
        Uri uriC = this.a.c();
        if (uriC == null) {
            return null;
        }
        return uriC;
    }

    @Override // defpackage.bye
    public final Map d() {
        return this.a.d();
    }

    @Override // defpackage.bye
    public final void e(bzg bzgVar) {
        bzgVar.getClass();
        this.a.e(bzgVar);
    }

    @Override // defpackage.bye
    public final void f() {
        if (this.c) {
            this.c = false;
            this.a.f();
        }
    }
}
