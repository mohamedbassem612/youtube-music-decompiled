package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Process;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.HorizontalScrollView;
import androidx.core.widget.NestedScrollView;
import com.google.android.libraries.elements.interfaces.Closure;
import com.google.android.libraries.elements.interfaces.Component;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.runtime.NodeTreeProcessorImpl;
import com.google.android.libraries.notifications.entrypoints.systemtray.SystemTrayActivity;
import j$.util.Collection;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class msh implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ msh(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View$OnLayoutChangeListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v53, types: [com.google.android.libraries.multiplatform.elements.NodeTreeProcessor, java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r0v58, types: [fem, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v52, types: [com.google.android.libraries.multiplatform.elements.NodeViewInterface, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, java.util.Collection, java.util.List] */
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
        Object obj;
        int i;
        mqt mqtVarJ;
        nzk nzkVarAk = null;
        int i2 = 3;
        int i3 = 4;
        boolean z = true;
        int i4 = 0;
        switch (this.$cid) {
            case 0:
                int i5 = msj.a;
                ((frp) this.a).c((View) this.b);
                return;
            case 1:
                int i6 = mrl.p;
                Object obj2 = this.b;
                int i7 = bac.a;
                View view = (View) obj2;
                azs.c(view, null);
                ?? r0 = this.a;
                if (r0 != 0) {
                    view.removeOnLayoutChangeListener(r0);
                    return;
                }
                return;
            case 2:
                npb npbVar = (npb) this.a;
                npl nplVar = npbVar.c;
                nplVar.b();
                for (asrj asrjVar : ((asru) this.b).b) {
                    String str = asrjVar.c;
                    String str2 = asrjVar.d;
                    View viewC = npbVar.c(str);
                    if (viewC != null) {
                        fhu fhuVarA = npi.a(fhu.g((fjw) viewC), str2, i4);
                        if (fhuVarA == null) {
                            Log.w("ElementsDebugger", "Highlight requested for non-existing Component: ".concat(String.valueOf(str2)));
                        } else {
                            fjw fjwVarH = fhuVarA.h();
                            if (fjwVarH != null) {
                                fwo fwoVarI = fhuVarA.i();
                                RectF rectF = new RectF(fhuVarA.a());
                                RectF rectF2 = new RectF(rectF.left - fwoVarI.k(1), rectF.top - fwoVarI.k(2), rectF.right + fwoVarI.k(i2), rectF.bottom + fwoVarI.k(4));
                                RectF rectF3 = new RectF(rectF.left + fwoVarI.j(1), rectF.top + fwoVarI.j(2), rectF.right - fwoVarI.j(i2), rectF.bottom - fwoVarI.j(4));
                                npk npkVar = new npk(rectF2, rectF, rectF3, new RectF(rectF3.left + fwoVarI.l(1), rectF3.top + fwoVarI.l(2), rectF3.right - fwoVarI.l(i2), rectF3.bottom - fwoVarI.l(4)));
                                nplVar.a.add(Pair.create(fjwVarH, npkVar));
                                fjwVarH.addOnAttachStateChangeListener(nplVar);
                                fjwVarH.getOverlay().add(npkVar);
                                fjwVarH.invalidate();
                            }
                        }
                    } else {
                        Log.w("ElementsDebugger", "Highlight requested for non-existing ElementsView: ".concat(String.valueOf(str)));
                    }
                    i4 = i4;
                    i2 = 3;
                }
                return;
            case 3:
                asrh asrhVar = (asrh) this.b;
                asrj asrjVar2 = asrhVar.b;
                if (asrjVar2 == null) {
                    asrjVar2 = asrj.a;
                }
                View viewC2 = ((npb) this.a).c(asrjVar2.c);
                if (viewC2 == null) {
                    Log.w("ElementsDebugger", "UpdateComponentModel requested for non-existing View: ".concat(String.valueOf(asrjVar2.c)));
                    return;
                }
                try {
                    int i8 = npi.a;
                    agkh agkhVar = new agkh(4);
                    npi.i(viewC2, new nph(new HashSet(), agkhVar, i4));
                    npg npgVar = (npg) agkhVar.d(true).get(asrjVar2.d);
                    if (npgVar != null) {
                        asnx asnxVar = asrhVar.c;
                        if (asnxVar == null) {
                            asnxVar = asnx.a;
                        }
                        synchronized (npgVar.e) {
                            Component component = npgVar.b;
                            if (component != null) {
                                component.debugSetModel(asnxVar.toByteArray());
                            } else {
                                npgVar.a.kk(nwl.b(asnxVar));
                            }
                            break;
                        }
                        return;
                    }
                    return;
                } catch (RuntimeException e) {
                    Log.e("ElementsDebugger", "Failed to get debugger infos", e);
                    return;
                }
            case 4:
                Object obj3 = this.b;
                Object obj4 = this.a;
                ((npq) obj4).a.execute(new msh(obj4, obj3, 5));
                return;
            case 5:
                ((Closure) this.b).run();
                ((npq) this.a).b.getAndDecrement();
                return;
            case 6:
                ((Closure) this.b).run();
                ((npq) this.a).b.getAndDecrement();
                return;
            case 7:
                ((Closure) this.b).run();
                ((npq) this.a).b.getAndDecrement();
                return;
            case 8:
                ((Closure) this.b).run();
                ((npp) this.a).a.getAndDecrement();
                return;
            case 9:
                ((npv) this.b).m((RecyclerView) this.a);
                return;
            case 10:
                Object obj5 = this.a;
                nyz nyzVar = (nyz) obj5;
                if (nyzVar.e) {
                    ci ciVar = nyzVar.j;
                    if (ciVar == null) {
                        return;
                    }
                    nzkVarAk = ciVar.ak();
                    if (!nzkVarAk.a) {
                        return;
                    }
                } else {
                    z = false;
                }
                Collection.EL.stream(this.b).flatMap(new nyw(obj5, nzkVarAk, z, i4)).forEach(new kjk(obj5, i3));
                return;
            case 11:
                aczl aczlVar = (aczl) this.b;
                Object obj6 = aczlVar.d;
                aepb aepbVar = (aepb) this.a;
                if (!((kwv) obj6).b(aepbVar)) {
                    throw new oef(2);
                }
                ((AtomicReference) aczlVar.f).set("2.975916745.".concat(String.valueOf(((gcz) aepbVar.c).c)));
                return;
            case 12:
                ((aesp) this.b).o((Uri) this.a);
                return;
            case 13:
                ooy ooyVar = (ooy) this.a;
                if (ooyVar.isAttachedToWindow() || ooyVar.b != (obj = this.b)) {
                    return;
                }
                opl oplVar = (opl) obj;
                if (oplVar.d()) {
                    return;
                }
                oplVar.c().v();
                return;
            case 14:
                ((opy) this.b).a((ehm) this.a);
                return;
            case 15:
                int i9 = oqu.t;
                ovk ovkVar = ((oqu) this.b).h;
                if (ovkVar != null) {
                    RecyclerView recyclerView = (RecyclerView) this.a;
                    if (recyclerView.q) {
                        ovkVar.e(recyclerView, 0, 0);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                erj.d((Context) this.a).j(this.b);
                return;
            case 17:
                ((otv) this.b).p((Drawable) this.a);
                return;
            case 18:
                jor jorVar = new jor(i2);
                ?? r2 = this.b;
                Collection.EL.removeIf(r2, jorVar);
                ((NodeTreeProcessorImpl) this.a).J(r2, "NodeTreeProcessorImpl.setMeasureOutputs()");
                return;
            case 19:
                ?? r1 = this.a;
                oyk oykVar = (oyk) r1;
                NodeTreeProcessor nodeTreeProcessor = oykVar.w;
                int i10 = -1;
                if (nodeTreeProcessor != 0 && (mqtVarJ = nodeTreeProcessor.j(r1)) != null) {
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(mqu.b);
                    mqtVarJ.c(aihlVarCheckIsLite);
                    Object objK = mqtVarJ.j.k(aihlVarCheckIsLite.d);
                    mqu mquVar = (mqu) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                    if ((mquVar.c & 1) != 0) {
                        ((owb) r1).m.set(mquVar.d);
                        i10 = mquVar.d;
                    }
                }
                if (i10 > 0) {
                    owb owbVar = (owb) r1;
                    if (owbVar.d) {
                        owbVar.g = i10;
                    } else {
                        owbVar.h = i10;
                    }
                } else {
                    Object obj7 = this.b;
                    atmi atmiVar = (atmi) obj7;
                    if (atmiVar.i != null || (Memory.peekByte(((mew) obj7).c + 8) & 2) != 0) {
                        if (atmiVar.i == null) {
                            mew mewVar = (mew) obj7;
                            if ((Memory.peekByte(mewVar.c + 8) & 2) != 0) {
                                atmiVar.i = new atks(mewVar.cp(true != atmi.a ? 16 : 24, atkr.a));
                            }
                        }
                        atks atksVar = atmiVar.i == null ? atkq.a : atmiVar.i;
                        owb owbVar2 = (owb) r1;
                        if (owbVar2.d) {
                            owbVar2.g = (int) ((Float.intBitsToFloat(Memory.peekInt(atksVar.c + 16, false)) * owbVar2.b) + 0.5f);
                        } else {
                            owbVar2.h = (int) ((Float.intBitsToFloat(Memory.peekInt(atksVar.c + 12, false)) * owbVar2.b) + 0.5f);
                        }
                    }
                }
                owb owbVar3 = (owb) r1;
                if (owbVar3.d) {
                    NestedScrollView nestedScrollView = owbVar3.e;
                    if (nestedScrollView != null) {
                        nestedScrollView.scrollTo(0, owbVar3.g);
                        owbVar3.e.setNestedScrollingEnabled(true);
                        owbVar3.e.setVerticalScrollBarEnabled(owbVar3.i);
                        owbVar3.e.setOverScrollMode(owbVar3.k);
                    }
                } else {
                    HorizontalScrollView horizontalScrollView = owbVar3.f;
                    if (horizontalScrollView != null) {
                        horizontalScrollView.scrollTo(owbVar3.h, 0);
                        owbVar3.f.setNestedScrollingEnabled(false);
                        owbVar3.f.setHorizontalScrollBarEnabled(owbVar3.j);
                        owbVar3.f.setOverScrollMode(owbVar3.k);
                    }
                }
                NodeTreeProcessor nodeTreeProcessor2 = oykVar.w;
                if (nodeTreeProcessor2 != null && ((i = owbVar3.h) > 0 || owbVar3.g > 0)) {
                    nodeTreeProcessor2.z(oykVar.A, i, owbVar3.g);
                }
                String strAs = oykVar.as();
                if (strAs != null) {
                    if (owbVar3.d) {
                        NestedScrollView nestedScrollView2 = owbVar3.e;
                        if (nestedScrollView2 != null) {
                            nestedScrollView2.setTag(strAs);
                            return;
                        }
                        return;
                    }
                    HorizontalScrollView horizontalScrollView2 = owbVar3.f;
                    if (horizontalScrollView2 != null) {
                        horizontalScrollView2.setTag(strAs);
                        return;
                    }
                    return;
                }
                return;
            default:
                int i11 = SystemTrayActivity.a;
                Object obj8 = this.b;
                Object obj9 = this.a;
                int threadPriority = Process.getThreadPriority(0);
                try {
                    Process.setThreadPriority(10);
                    awmd awmdVar = (awmd) pnv.a((Context) obj9).cQ().get("systemtray");
                    if (awmdVar != null && awmdVar.io() != null) {
                        ((pma) awmdVar.io()).d((Intent) obj8, plb.c(), TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()));
                        break;
                    }
                    return;
                } finally {
                    Process.setThreadPriority(threadPriority);
                }
        }
    }

    public /* synthetic */ msh(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
