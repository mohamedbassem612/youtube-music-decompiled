package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import androidx.work.Worker;
import androidx.work.impl.WorkDatabase;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qf implements Function0 {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ qf(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:47:0x015d  */
    /* JADX WARN: Code duplicated, block: B:57:0x019b  */
    /* JADX WARN: Code duplicated, block: B:79:0x021f  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws NoSuchMethodException, ClassNotFoundException {
        Object qvVar;
        boolean z;
        String string;
        Class clsA = null;
        switch (this.$cid) {
            case 0:
                qvVar = new qv(new mc(this.a, 9, null));
                break;
            case 1:
                djj djjVar = new djj();
                ((qg) this.a).getOnBackPressedDispatcher().b().a(djjVar);
                qvVar = djjVar;
                break;
            case 2:
                return awmy.a;
            case 3:
                dov dovVar = (dov) this.a;
                Class<?> clsLoadClass = ((ClassLoader) dovVar.a).loadClass("androidx.window.extensions.WindowExtensionsProvider");
                clsLoadClass.getClass();
                Method declaredMethod = clsLoadClass.getDeclaredMethod("getWindowExtensions", null);
                Class clsF = dovVar.f();
                declaredMethod.getClass();
                return Boolean.valueOf(azx.k(declaredMethod, clsF) && azx.l(declaredMethod));
            case 4:
                dwl dwlVar = (dwl) this.a;
                return BigInteger.valueOf(dwlVar.b).shiftLeft(32).or(BigInteger.valueOf(dwlVar.c)).shiftLeft(32).or(BigInteger.valueOf(dwlVar.d));
            case 5:
                ayq ayqVar = (ayq) this.a;
                Method method = ((dov) ayqVar.c).f().getMethod("getWindowLayoutComponent", null);
                Class clsO = ayqVar.o();
                method.getClass();
                return Boolean.valueOf(azx.l(method) && azx.k(method, clsO));
            case 6:
                Class<?> clsLoadClass2 = ((ClassLoader) ((ayq) this.a).b).loadClass("androidx.window.extensions.layout.FoldingFeature");
                clsLoadClass2.getClass();
                Method method2 = clsLoadClass2.getMethod("getBounds", null);
                Method method3 = clsLoadClass2.getMethod("getType", null);
                Method method4 = clsLoadClass2.getMethod("getState", null);
                method2.getClass();
                int i = awrn.a;
                if (azx.m(method2, new awqv(Rect.class)) && azx.l(method2)) {
                    method3.getClass();
                    if (azx.m(method3, new awqv(Integer.TYPE)) && azx.l(method3)) {
                        method4.getClass();
                        z = azx.m(method4, new awqv(Integer.TYPE)) && azx.l(method4);
                    }
                }
                return Boolean.valueOf(z);
            case 7:
                ayq ayqVar2 = (ayq) this.a;
                Method method5 = ayqVar2.n().getMethod("getDisplayFoldFeatures", null);
                Type genericReturnType = method5.getGenericReturnType();
                genericReturnType.getClass();
                Type type = ((ParameterizedType) genericReturnType).getActualTypeArguments()[0];
                type.getClass();
                Class cls = (Class) type;
                method5.getClass();
                return Boolean.valueOf(azx.l(method5) && azx.k(method5, List.class) && awrc.c(cls, ayqVar2.m()));
            case 8:
                Class clsM = ((ayq) this.a).m();
                Method method6 = clsM.getMethod("getType", null);
                Method method7 = clsM.getMethod("hasProperty", Integer.TYPE);
                Method method8 = clsM.getMethod("hasProperties", int[].class);
                method6.getClass();
                if (azx.l(method6) && azx.k(method6, Integer.TYPE)) {
                    method7.getClass();
                    if (azx.l(method7) && azx.k(method7, Boolean.TYPE)) {
                        method8.getClass();
                        z = azx.l(method8) && azx.k(method8, Boolean.TYPE);
                    }
                }
                return Boolean.valueOf(z);
            case 9:
                ayq ayqVar3 = (ayq) this.a;
                Method method9 = ayqVar3.o().getMethod("getSupportedWindowFeatures", null);
                method9.getClass();
                return Boolean.valueOf(azx.l(method9) && azx.k(method9, ayqVar3.n()));
            case 10:
                ayq ayqVar4 = (ayq) this.a;
                try {
                    clsA = ((dwg) ayqVar4.a).a();
                    break;
                } catch (ClassNotFoundException unused) {
                }
                if (clsA != null) {
                    Class clsO2 = ayqVar4.o();
                    Method method10 = clsO2.getMethod("addWindowLayoutInfoListener", Activity.class, clsA);
                    Method method11 = clsO2.getMethod("removeWindowLayoutInfoListener", clsA);
                    method10.getClass();
                    if (azx.l(method10)) {
                        method11.getClass();
                        z = azx.l(method11);
                    }
                }
                return Boolean.valueOf(z);
            case 11:
                ClassLoader classLoader = (ClassLoader) ((ayq) this.a).b;
                Class<?> clsLoadClass3 = classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutInfo");
                clsLoadClass3.getClass();
                Method method12 = clsLoadClass3.getMethod("getEngagementModeFlags", null);
                Method method13 = clsLoadClass3.getMethod("hasEngagementModeFlag", Integer.TYPE);
                Class<?> clsLoadClass4 = classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutInfo$Builder");
                clsLoadClass4.getClass();
                Method method14 = clsLoadClass4.getMethod("setEngagementModeFlags", Integer.TYPE);
                Method method15 = clsLoadClass4.getMethod("build", null);
                method12.getClass();
                if (azx.l(method12)) {
                    Class cls2 = Integer.TYPE;
                    int i2 = awrn.a;
                    if (azx.m(method12, new awqv(cls2))) {
                        method13.getClass();
                        if (azx.l(method13) && azx.m(method13, new awqv(Boolean.TYPE))) {
                            method14.getClass();
                            if (azx.l(method14)) {
                                method15.getClass();
                                z = azx.l(method15) && azx.k(method15, clsLoadClass3);
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 12:
                Class clsO3 = ((ayq) this.a).o();
                Method method16 = clsO3.getMethod("addWindowLayoutInfoListener", Context.class, qf$$ExternalSyntheticApiModelOutline0.m$1());
                Method method17 = clsO3.getMethod("removeWindowLayoutInfoListener", qf$$ExternalSyntheticApiModelOutline0.m$1());
                method16.getClass();
                if (azx.l(method16)) {
                    method17.getClass();
                    z = azx.l(method17);
                }
                return Boolean.valueOf(z);
            case 13:
                return ((Worker) this.a).c();
            case 14:
                Object obj = this.a;
                ebm ebmVar = (ebm) obj;
                WorkDatabase workDatabase = ebmVar.d;
                workDatabase.getClass();
                workDatabase.o(new dhr(workDatabase, obj, 10));
                dms.k(ebmVar);
                return awmy.a;
            case 15:
                return Boolean.valueOf(hgm.c(((hjn) this.a).g));
            case 16:
                hjn hjnVar = (hjn) this.a;
                return new hjy(hjnVar.e, hjnVar.g, hjnVar.i, hjnVar.f);
            case 17:
                Bundle bundle = ((hjn) this.a).c;
                return Boolean.valueOf(bundle != null ? bundle.getBoolean("com.google.android.apps.youtube.music.mediabrowser.force_refresh", false) : false);
            case 18:
                int i3 = hpd.b;
                return (alvt) ((hth) this.a).g().orElse(null);
            case 19:
                int i4 = hpd.b;
                return (alvt) ((hth) this.a).g().orElse(null);
            default:
                Bundle arguments = ((cc) this.a).getArguments();
                return (arguments == null || (string = arguments.getString("playlist_id")) == null) ? "" : string;
        }
        return qvVar;
    }
}
