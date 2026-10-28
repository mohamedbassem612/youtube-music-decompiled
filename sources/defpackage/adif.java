package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.google.android.libraries.blocks.Container;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adif {
    public final Object a;

    public adif(Optional optional) {
        optional.isPresent();
        this.a = new mav((Container) optional.get());
    }

    public static apgm e(int i) {
        aihf aihfVarCreateBuilder = apgm.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        apgm apgmVar = (apgm) aihfVarCreateBuilder.instance;
        apgmVar.c = i - 1;
        apgmVar.b |= 1;
        return (apgm) aihfVarCreateBuilder.build();
    }

    public static apgi f(List list, apgj apgjVar) {
        aihf aihfVarCreateBuilder = apgi.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        apgi apgiVar = (apgi) aihfVarCreateBuilder.instance;
        apgiVar.d = 1;
        apgiVar.b |= 1;
        if (!list.isEmpty()) {
            aihfVarCreateBuilder.copyOnWrite();
            apgi apgiVar2 = (apgi) aihfVarCreateBuilder.instance;
            aiie aiieVar = apgiVar2.c;
            if (!aiieVar.c()) {
                apgiVar2.c = aihn.mutableCopy(aiieVar);
            }
            aifs.addAll(list, apgiVar2.c);
        }
        if (apgjVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            apgi apgiVar3 = (apgi) aihfVarCreateBuilder.instance;
            apgiVar3.e = apgjVar;
            apgiVar3.b |= 2;
        }
        return (apgi) aihfVarCreateBuilder.build();
    }

    public static apgn g(List list) {
        aihf aihfVarCreateBuilder = apgn.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        apgn apgnVar = (apgn) aihfVarCreateBuilder.instance;
        apgnVar.d = 1;
        apgnVar.b |= 1;
        if (!list.isEmpty()) {
            aihfVarCreateBuilder.copyOnWrite();
            apgn apgnVar2 = (apgn) aihfVarCreateBuilder.instance;
            aiie aiieVar = apgnVar2.c;
            if (!aiieVar.c()) {
                apgnVar2.c = aihn.mutableCopy(aiieVar);
            }
            aifs.addAll(list, apgnVar2.c);
        }
        return (apgn) aihfVarCreateBuilder.build();
    }

    public static final String h(ajwo ajwoVar) {
        if (ajwoVar != null && aecm.aD(ajwoVar)) {
            try {
                String strAd = aecm.ad(ajwoVar);
                strAd.getClass();
                if (strAd.length() > 0) {
                    return strAd;
                }
            } catch (Throwable th) {
                atqp.i(th);
            }
        }
        return null;
    }

    public final boolean a(Context context, String str) {
        if (!b(context)) {
            return false;
        }
        aiie aiieVar = ((vxz) ((hno) this.a).i).f(0, 45799409L, new byte[]{10, 21, 115, 104, 111, 114, 116, 115, 45, 99, 111, 109, 109, 101, 110, 116, 115, 45, 112, 97, 110, 101, 108, 10, 41, 70, 69, 99, 111, 109, 109, 101, 110, 116, 95, 115, 104, 111, 114, 116, 95, 109, 111, 98, 105, 108, 101, 95, 118, 105, 100, 101, 111, 95, 114, 101, 112, 108, 105, 101, 115, 95, 112, 97, 103, 101}).b;
        agrf agrfVar = twm.a;
        return yno.H(context) && aiieVar.contains(str);
    }

    public final boolean b(Context context) {
        return ((vxz) ((hno) this.a).i).l(240, 45794852L, false) && twm.v(context);
    }

    public final void c() {
        hno hnoVar = (hno) this.a;
        if (hnoVar.bf()) {
            hnoVar.aK();
        } else {
            hnoVar.aK();
        }
    }

    public final void d(aldd alddVar) {
        aihf aihfVarCreateBuilder = aldb.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aldb aldbVar = (aldb) aihfVarCreateBuilder.instance;
        aldbVar.c = alddVar.aW;
        aldbVar.b |= 1;
        xeu xeuVar = (xeu) this.a;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.GENERIC_CLIENT_EXPERIMENT_EVENT);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        aldb aldbVar2 = (aldb) aihfVarCreateBuilder.build();
        aldbVar2.getClass();
        alouVar.d = aldbVar2;
        alouVar.c = 423;
        xeuVar.b((alou) alosVar.build());
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [acnm, java.lang.Object] */
    public final apdw i() {
        Optional optionalA = this.a.a();
        if (true == optionalA.isPresent()) {
            Object obj = optionalA.get();
            Optional optionalI = ((acoi) obj).t.i();
            vre vreVar = new vre(obj, 19);
            if (true == optionalI.isPresent()) {
                Object obj2 = optionalI.get();
                acra acraVar = (acra) obj2;
                optionalI = Optional.ofNullable(((acoi) vreVar.a).D(acraVar.h, acraVar.f));
            }
            optionalA = Optional.ofNullable((apdw) optionalI.orElse(apdw.REEL_LOOP_BEHAVIOR_UNKNOWN));
        }
        return (apdw) optionalA.orElse(apdw.REEL_LOOP_BEHAVIOR_UNKNOWN);
    }

    public final aciz j() {
        return new aciz((xeu) this.a);
    }

    public adif(Object obj) {
        this.a = obj;
    }

    public adif() {
        this.a = new awli(acvn.c);
    }

    public adif(xeu xeuVar, byte[] bArr) {
        xeuVar.getClass();
        this.a = xeuVar;
    }

    public adif(ColorDrawable colorDrawable) {
        this.a = colorDrawable;
    }

    public adif(char[] cArr) {
        this.a = new AtomicLong(1L);
    }

    public adif(awmd awmdVar) {
        awmdVar.getClass();
        this.a = awmdVar;
    }

    public adif(byte[] bArr, byte[] bArr2) {
        this.a = new ArrayList();
    }

    public adif(byte[] bArr) {
        this.a = Optional.empty();
        Optional.empty();
    }

    public adif(awmd awmdVar, byte[] bArr) {
        awmdVar.getClass();
        this.a = awmdVar;
    }

    public adif(acts actsVar) {
        actsVar.getClass();
        this.a = actsVar;
    }

    public adif(avmb avmbVar) {
        avmbVar.getClass();
        this.a = avmbVar;
    }
}
