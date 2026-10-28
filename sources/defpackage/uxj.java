package defpackage;

import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uxj {
    public final uys a;
    public final awli b;
    public final awly c;
    public final awly d;
    public awli e;
    public final awly f;
    public final awlu g;
    public final awlu h;
    public aqhu i;
    public ardq j;
    public apwr k;
    public final uxh l;
    public final uxd m;
    public List n;
    public final aaok o;
    public final xpl p;
    public final xpl q;
    private final uyv r;
    private final awli s;
    private final awlu t;
    private final awlu u;
    private final awly v;
    private final Executor w;
    private final vor x;
    private final xsc y;

    public uxj(uys uysVar, uyv uyvVar, aaok aaokVar, uxh uxhVar, xpl xplVar, Executor executor, vor vorVar, uxd uxdVar, xpl xplVar2, xsc xscVar) {
        awli awliVar = new awli();
        this.b = awliVar;
        this.c = awliVar.az();
        awli awliVar2 = new awli();
        this.s = awliVar2;
        this.d = awliVar2.az();
        awlu awluVarAv = awlu.av(1);
        this.t = awluVarAv;
        awlu awluVarAv2 = awlu.av(1);
        this.u = awluVarAv2;
        this.e = new awli();
        this.v = awluVarAv.az();
        this.f = awluVarAv2.az();
        this.g = awlu.av(1);
        this.h = awlu.av(1);
        this.a = uysVar;
        this.r = uyvVar;
        this.o = aaokVar;
        this.l = uxhVar;
        this.m = uxdVar;
        this.q = xplVar2;
        this.x = vorVar;
        this.w = executor;
        this.y = xscVar;
        this.p = xplVar;
    }

    public final void a() {
        agke agkeVar = agpi.a;
        e(agkeVar, null, agkeVar, null);
    }

    public final void c() {
        int i = 9;
        iqi iqiVar = new iqi(i);
        xpl xplVar = this.p;
        taf.j(ahno.an(ahno.ar(((ayq) xplVar.a).j(iqiVar), new sdp(i), MoreExecutors.directExecutor()), IOException.class, new uzh(xplVar, 2), MoreExecutors.directExecutor()), new tsq(4));
    }

    public final void d() {
        List<akuf> list = this.n;
        if (list != null) {
            vor vorVar = this.x;
            Executor executor = this.w;
            if (executor != null) {
                executor.execute(afwl.i(new ull(vorVar, 11)));
                for (akuf akufVar : list) {
                    if (akufVar.b == 138681066) {
                        executor.execute(afwl.i(new uqd(vorVar, akufVar, 2)));
                    }
                }
            }
        }
    }

    public final void e(agke agkeVar, apji apjiVar, agke agkeVar2, apji apjiVar2) {
        xsc xscVar = this.y;
        if (xscVar == null) {
            this.b.kk(agpr.a);
            return;
        }
        if (apjiVar != null) {
            if (this.o.L()) {
                this.v.kk(apjiVar);
            } else {
                this.t.kk(apjiVar);
            }
        }
        if (apjiVar2 != null) {
            if (this.o.L()) {
                this.f.kk(apjiVar2);
            } else {
                this.u.kk(apjiVar2);
            }
        }
        ((awly) xscVar.a).kk(agkeVar2);
        ((awly) xscVar.c).kk(agkeVar);
        HashSet hashSet = new HashSet();
        int size = agkeVar.size();
        for (int i = 0; i < size; i++) {
            arft arftVarA = arft.a(xsc.J((apji) agkeVar.get(i)).c);
            if (arftVarA == null) {
                arftVarA = arft.TOOLBELT_BUTTON_TYPE_UNSPECIFIED;
            }
            int iOrdinal = arftVarA.ordinal();
            if (iOrdinal == 1) {
                hashSet.add(uxc.GET_ASSET_RELIGHT);
            } else if (iOrdinal == 2) {
                hashSet.add(uxc.GET_ASSET_RETOUCH);
            } else if (iOrdinal == 3) {
                hashSet.add(uxc.GET_ASSET_FILTER_PICKER_CAMERA);
            } else if (iOrdinal == 4) {
                hashSet.add(uxc.GET_ASSET_GREEN_SCREEN);
            }
        }
        int size2 = agkeVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arft arftVarA2 = arft.a(xsc.J((apji) agkeVar2.get(i2)).c);
            if (arftVarA2 == null) {
                arftVarA2 = arft.TOOLBELT_BUTTON_TYPE_UNSPECIFIED;
            }
            if (arftVarA2 == arft.TOOLBELT_BUTTON_TYPE_FILTER_PICKER) {
                hashSet.add(uxc.GET_ASSET_FILTER_PICKER_EDITOR);
            }
        }
        this.b.kk(agkz.n(hashSet));
    }

    public final void f(ardq ardqVar) {
        this.j = ardqVar;
        uyv uyvVar = this.r;
        ArrayList arrayList = uyvVar.b;
        if (arrayList.isEmpty()) {
            if (ardqVar == null) {
                arrayList.clear();
                uyvVar.c.clear();
                uyvVar.d.clear();
                try {
                    InputStream inputStreamOpen = uyvVar.a().c.getAssets().open("android_shorts_timeline_builtin_effects_settings.binarypb");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    uxt.a(inputStreamOpen, byteArrayOutputStream);
                    ardq ardqVar2 = (ardq) aihn.parseFrom(ardq.a, byteArrayOutputStream.toByteArray(), ExtensionRegistryLite.getGeneratedRegistry());
                    inputStreamOpen.close();
                    byteArrayOutputStream.close();
                    ahno.O(uyvVar.b(ardqVar2, true));
                } catch (IOException e) {
                    throw new RuntimeException("Failed to load or parse: android_shorts_timeline_builtin_effects_settings.binarypb", e);
                }
            } else if (!uyvVar.b(ardqVar, false)) {
                ((agrc) ((agrc) uyv.a.b()).k("com/google/android/libraries/youtube/creation/effects/innertube/deprecated/KazooEffectsLoader", "setVideoEffectsSettings", 225, "KazooEffectsLoader.java")).w("VideoEffectsSettings from InnerTube is invalid. %s", "Using built-in effects.");
                arrayList.clear();
                uyvVar.c.clear();
                uyvVar.d.clear();
                InputStream inputStreamOpen2 = uyvVar.a().c.getAssets().open("android_shorts_timeline_builtin_effects_settings.binarypb");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                uxt.a(inputStreamOpen2, byteArrayOutputStream2);
                ardq ardqVar3 = (ardq) aihn.parseFrom(ardq.a, byteArrayOutputStream2.toByteArray(), ExtensionRegistryLite.getGeneratedRegistry());
                inputStreamOpen2.close();
                byteArrayOutputStream2.close();
                ahno.O(uyvVar.b(ardqVar3, true));
            }
            synchronized (uyvVar.e) {
            }
        }
    }

    public final boolean g() {
        aaok aaokVar = this.o;
        return aaokVar.P() || aaokVar.R();
    }

    public final qcb i() {
        return new qcb(this.r, null);
    }
}
