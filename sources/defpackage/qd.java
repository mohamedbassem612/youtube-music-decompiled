package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.util.Pair;
import android.view.Surface;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.tabs.TabbedView;
import com.google.android.libraries.multiplatform.elements.runtime.NodeTreeProcessorImpl;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.vr.vrcore.controller.api.ControllerServiceBridge;
import j$.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qd implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public qd(TextView textView, Typeface typeface, int i, int i2) {
        this.$cid = i2;
        this.b = textView;
        this.c = typeface;
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [afdf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [cjv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, rb] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        np npVar;
        int i;
        int i2 = 0;
        bitmapDecodeRegion = null;
        bitmapDecodeRegion = null;
        bitmapDecodeRegion = null;
        bitmapDecodeRegion = null;
        bitmapDecodeRegion = null;
        bitmapDecodeRegion = null;
        Bitmap bitmapDecodeRegion = null;
        switch (this.$cid) {
            case 0:
                int i3 = this.a;
                rg rgVar = (rg) this.c;
                String str = (String) rgVar.a.get(Integer.valueOf(i3));
                if (str != null) {
                    qv qvVar = (qv) rgVar.d.get(str);
                    Object obj = qvVar != null ? qvVar.a : null;
                    Object obj2 = ((zf) this.b).a;
                    if (obj == null) {
                        rgVar.f.remove(str);
                        rgVar.e.put(str, obj2);
                        return;
                    } else {
                        ?? r2 = qvVar.a;
                        if (rgVar.c.remove(str)) {
                            r2.a(obj2);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 1:
                le.f((TextView) this.b, (Typeface) this.c, this.a);
                return;
            case 2:
                ((rg) this.b).e(this.a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (Serializable) this.c));
                return;
            case 3:
                ((wj) this.c).a.p().d(this.a, this.b);
                return;
            case 4:
                ((wj) this.c).d(this.a, this.b);
                return;
            case 5:
                Pair pair = (Pair) this.c;
                ((cdg) this.b).a.i.c(((Integer) pair.first).intValue(), (cnm) pair.second, this.a);
                return;
            case 6:
                int i4 = this.a;
                ?? r1 = this.b;
                aae aaeVar = (aae) this.c;
                r1.c(aaeVar.a, (cnm) aaeVar.b, i4);
                return;
            case 7:
                ((hef) this.c).d(this.a, (String) this.b);
                return;
            case 8:
                ?? r0 = this.c;
                TabbedView tabbedView = (TabbedView) r0;
                tabbedView.b.k(r0);
                ?? r7 = this.b;
                ArrayList arrayList = new ArrayList((Collection) r7);
                if (tabbedView.getLayoutDirection() == 1 && !tabbedView.B()) {
                    Collections.reverse(arrayList);
                }
                int i5 = this.a;
                tabbedView.a.i(arrayList);
                if (i5 >= 0 && i5 < r7.size()) {
                    i2 = i5;
                }
                if (r7.isEmpty()) {
                    tabbedView.a.i(agpi.a);
                    tabbedView.r(-1);
                    tabbedView.b.e(r0);
                    tabbedView.w(null);
                    return;
                }
                tabbedView.r(i2);
                int iC = tabbedView.c(i2);
                tabbedView.a.k(iC);
                afdk afdkVarC = tabbedView.b.c(iC);
                if (afdkVarC != null && !afdkVarC.c()) {
                    afdkVarC.a();
                }
                tabbedView.b.e(r0);
                if (afdkVarC != null && iC >= 0 && iC < tabbedView.a.c().size()) {
                    tabbedView.w(((jhq) tabbedView.a.c().get(iC)).b);
                }
                tabbedView.q(i2);
                return;
            case 9:
                final kcw kcwVar = (kcw) this.c;
                kec kecVar = kcwVar.i;
                if (kecVar != null) {
                    final int i6 = this.a;
                    final agzp agzpVar = (agzp) this.b;
                    kecVar.a().q(new low() { // from class: kcv
                        @Override // defpackage.low
                        public final void e(Object obj3) {
                            if (((Boolean) obj3).booleanValue()) {
                                agzp agzpVar2 = agzpVar;
                                kcw kcwVar2 = kcwVar;
                                aihf aihfVarCreateBuilder = agzp.a.createBuilder(agzpVar2);
                                aihfVarCreateBuilder.copyOnWrite();
                                agzp agzpVar3 = (agzp) aihfVarCreateBuilder.instance;
                                String str2 = kcwVar2.g;
                                str2.getClass();
                                agzpVar3.b |= 16384;
                                agzpVar3.f = str2;
                                aihfVarCreateBuilder.copyOnWrite();
                                agzp agzpVar4 = (agzp) aihfVarCreateBuilder.instance;
                                str2.getClass();
                                agzpVar4.b |= 32768;
                                agzpVar4.g = str2;
                                Long l = kcwVar2.h;
                                if (l != null) {
                                    int iLongValue = (int) l.longValue();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    agzp agzpVar5 = (agzp) aihfVarCreateBuilder.instance;
                                    agzpVar5.b |= 65536;
                                    agzpVar5.h = iLongValue;
                                }
                                agzp agzpVar6 = (agzp) aihfVarCreateBuilder.build();
                                int i7 = kcwVar2.j;
                                int i8 = i7 - 1;
                                if (i7 == 0) {
                                    throw null;
                                }
                                int i9 = i6 - 1;
                                jsb jsbVarA = (i8 == 0 || i8 != 1) ? jsb.a(i9, agzpVar6) : new jsb(Integer.valueOf(i9), agzpVar6, 1, null);
                                khn.e();
                                kyr kyrVar = kcwVar2.k;
                                if (kyrVar != null) {
                                    kyrVar.r(jsbVarA);
                                }
                            }
                        }
                    });
                    return;
                }
                return;
            case 10:
                ((NodeTreeProcessorImpl) this.c).w(this.a, this.b);
                return;
            case 11:
                Layout layout = ((TextView) ((fx) this.b).findViewById(R.id.license_activity_textview)).getLayout();
                if (layout != null) {
                    ((ScrollView) this.c).scrollTo(0, layout.getLineTop(layout.getLineForOffset(this.a)));
                    return;
                }
                return;
            case 12:
                int i7 = this.a;
                Object obj3 = this.c;
                if (i7 == 0 || i7 == ((yvk) obj3).b.get()) {
                    Object obj4 = this.b;
                    yvk yvkVar = (yvk) obj3;
                    yvj yvjVar = yvkVar.a;
                    zkf.d(yvjVar);
                    yvjVar.jy((agke) obj4, yvkVar.c);
                    return;
                }
                return;
            case 13:
                Object obj5 = this.b;
                try {
                    ((zae) this.c).g(this.a);
                    return;
                } finally {
                    ((CountDownLatch) obj5).countDown();
                }
            case 14:
                Object obj6 = this.b;
                try {
                    zjr zjrVar = ((zae) obj6).c;
                    if (zjrVar.bB()) {
                        if (this.a != ((zae) obj6).h.get()) {
                            return;
                        }
                    }
                    Surface surface = ((zae) obj6).l;
                    Object obj7 = this.c;
                    if (surface != obj7) {
                        ((zae) obj6).o = true;
                        if (obj7 == null || (zjrVar.bA() && !((Surface) obj7).isValid())) {
                            obj7 = null;
                        }
                        ((zae) obj6).l = (Surface) obj7;
                        if (zjrVar.bB()) {
                            ((zae) obj6).i = ((zae) obj6).l != null;
                        }
                        if (((zae) obj6).l == null) {
                            ((zae) obj6).s.c();
                            ((zae) obj6).r.c(null);
                        }
                        ((zae) obj6).h();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    ((zae) obj6).i(e);
                    return;
                }
            case 15:
                for (jtj jtjVar : ((zah) ((zag) this.c).a).a) {
                    Object obj8 = this.b;
                    byte[] bArr = (byte[]) obj8;
                    if (jtjVar.b(bArr)) {
                        for (jth jthVar : jtjVar.a) {
                            if (jthVar.q(bArr)) {
                                if (!jthVar.r()) {
                                }
                                int i8 = this.a;
                                if (i8 != 1) {
                                    if (i8 != 2) {
                                        if (i8 != 3) {
                                        }
                                        jthVar.k();
                                    }
                                    jthVar.h(false);
                                }
                                jthVar.g = 3;
                                jthVar.n.d(jthVar);
                            }
                            break;
                        }
                    }
                }
                return;
            case 16:
                int i9 = this.a;
                Object obj9 = this.b;
                long j = ((long) i9) << 32;
                long jE = ((ablz) obj9).e() | j;
                Object obj10 = this.c;
                synchronized (((ablx) obj10).l) {
                    if (jE == ((ablx) obj10).h || jE == ((ablx) obj10).f) {
                        ((ablx) obj10).h();
                    } else {
                        Uri uriF = ablx.f((ablz) obj9, i9);
                        if ((uriF != null ? (BitmapRegionDecoder) ((ablx) obj10).d.get(uriF) : null) == null) {
                            ((ablx) obj10).a((ablz) obj9, i9);
                            ((ablx) obj10).h();
                        } else {
                            long jE2 = j | ((ablz) obj9).e();
                            Bitmap bitmap = ((ablx) obj10).g;
                            if (bitmap != null) {
                                ahno.F(bitmap != ((ablx) obj10).i);
                            }
                            Bitmap bitmap2 = ((ablx) obj10).g;
                            Uri uriF2 = ablx.f((ablz) obj9, i9);
                            if (uriF2 != null) {
                                BitmapRegionDecoder bitmapRegionDecoder = (BitmapRegionDecoder) ((ablx) obj10).d.get(uriF2);
                                if (bitmapRegionDecoder == null) {
                                    ((ablx) obj10).a((ablz) obj9, i9);
                                } else {
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    if (bitmap2 != null) {
                                        options.inBitmap = bitmap2;
                                    }
                                    options.inMutable = true;
                                    try {
                                        int iC2 = i9 % ((ablz) obj9).c();
                                        int i10 = ((ablz) obj9).d;
                                        int i11 = iC2 / i10;
                                        int i12 = i9 % i10;
                                        int i13 = ((ablz) obj9).a;
                                        int i14 = i12 * i13;
                                        int i15 = ((ablz) obj9).b;
                                        int i16 = i11 * i15;
                                        Rect rect = new Rect(i14, i16, (i13 + i14) - 1, (i15 + i16) - 1);
                                        int i17 = ((ablx) obj10).p;
                                        if (i17 == 1) {
                                            rect.set(rect.left, rect.top, rect.centerX(), rect.bottom);
                                        } else if (i17 == 3) {
                                            rect.set(rect.left, rect.top, rect.right, rect.centerY());
                                        }
                                        if (bitmapRegionDecoder.getWidth() >= rect.right && bitmapRegionDecoder.getHeight() >= rect.bottom && rect.width() > 0 && rect.height() > 0) {
                                            bitmapDecodeRegion = bitmapRegionDecoder.decodeRegion(rect, options);
                                        }
                                    } catch (Exception e2) {
                                        zvp.a(zvn.b, zvm.k, "Storyboard regionDecoder.decodeRegion exception - ".concat(String.valueOf(e2.getClass().getName())));
                                        ((ablx) obj10).m = true;
                                    }
                                }
                            }
                            if (bitmapDecodeRegion != null) {
                                ((ablx) obj10).g = ((ablx) obj10).i;
                                ((ablx) obj10).f = ((ablx) obj10).h;
                                ((ablx) obj10).i = bitmapDecodeRegion;
                                ((ablx) obj10).h = jE2;
                                ((ablx) obj10).g(((ablx) obj10).i);
                            } else {
                                ((ablx) obj10).h();
                            }
                        }
                    }
                    ((ablx) obj10).n = false;
                    break;
                }
                return;
            case 17:
                ((acqz) this.b).I((acqy) this.c, this.a);
                return;
            case 18:
                aeei aeeiVar = (aeei) this.b;
                vxz vxzVar = aeeiVar.s;
                Object obj11 = this.c;
                if (!vxzVar.l(214, 45816306L, false) || ((npVar = aeeiVar.a.n) != null && Objects.equals(obj11, aeeiVar.b(npVar)))) {
                    int i18 = this.a;
                    if (aeeiVar.u == null || obj11 != aeeiVar.l) {
                        aeeiVar.f();
                        View view = (View) obj11;
                        int height = view.getHeight();
                        if (aeeiVar.j()) {
                            if (height > 0) {
                                aeeiVar.o = height;
                            } else {
                                height = aeeiVar.o;
                            }
                        }
                        aeeiVar.u = new aeeg(aeeiVar, view, i18, height);
                        RecyclerView recyclerView = aeeiVar.a;
                        recyclerView.aJ(aeeiVar.u);
                        recyclerView.w(aeeiVar.e);
                        aeeiVar.n = (int) (height * aeeiVar.a(i18, view, aeeiVar.f));
                        aeeiVar.l = view;
                    } else {
                        aeeiVar.a.P();
                    }
                    if (vxzVar.l(214, 45816306L, false)) {
                        View view2 = (View) obj11;
                        aeeiVar.c(i18, view2, aeeiVar.a(i18, view2, aeeiVar.f));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                int i19 = this.a;
                ahem ahemVar = (ahem) this.b;
                ListenableFuture[] listenableFutureArr = ahemVar.d;
                ListenableFuture listenableFuture = listenableFutureArr[i19];
                listenableFuture.getClass();
                listenableFutureArr[i19] = null;
                int i20 = ahemVar.e;
                while (true) {
                    Object obj12 = this.c;
                    i = ((agpi) obj12).d;
                    if (i20 < i) {
                        i = i20 + 1;
                        if (((ahch) ((agke) obj12).get(i20)).setFuture(listenableFuture)) {
                            ahemVar.a();
                        } else {
                            i20 = i;
                        }
                    }
                }
                ahemVar.e = i;
                return;
            default:
                ((ControllerServiceBridge) this.b).c(this.a, (aukt) this.c);
                return;
        }
    }

    public /* synthetic */ qd(Object obj, int i, Object obj2, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.a = i;
        this.c = obj2;
    }

    public /* synthetic */ qd(Object obj, int i, Object obj2, int i2, byte[] bArr) {
        this.$cid = i2;
        this.c = obj;
        this.a = i;
        this.b = obj2;
    }

    public /* synthetic */ qd(Object obj, Object obj2, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }

    public /* synthetic */ qd(Object obj, Object obj2, int i, int i2, byte[] bArr) {
        this.$cid = i2;
        this.c = obj;
        this.b = obj2;
        this.a = i;
    }
}
