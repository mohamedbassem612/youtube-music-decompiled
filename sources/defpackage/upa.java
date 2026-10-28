package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.util.Size;
import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import j$.util.Optional;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class upa implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ upa(NodeTreeProcessor nodeTreeProcessor, oqu oquVar, oqz oqzVar, oon oonVar, np npVar, RecyclerView recyclerView, boolean z, oqr oqrVar, int i) {
        this.$cid = i;
        this.b = nodeTreeProcessor;
        this.f = oquVar;
        this.d = oqzVar;
        this.h = oonVar;
        this.e = npVar;
        this.g = recyclerView;
        this.a = z;
        this.c = oqrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, oon] */
    /* JADX WARN: Type inference failed for: r10v4, types: [com.google.android.libraries.multiplatform.elements.NodeTreeProcessor, java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r2v8, types: [zoz] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.google.android.libraries.multiplatform.elements.NodeTreeProcessor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [aduv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, uoi] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, oov] */
    /* JADX WARN: Type inference failed for: r6v20, types: [com.google.android.libraries.multiplatform.elements.NodeTreeProcessor, java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, oqz] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        final ?? r10;
        ?? r0;
        int i = this.$cid;
        int i2 = 0;
        if (i == 0) {
            AtomicBoolean atomicBoolean = ((upd) this.c).a;
            Object obj3 = this.b;
            if (!atomicBoolean.get() && (obj = this.d) != null && (obj2 = this.e) != null) {
                if (((Optional) this.f).isEmpty()) {
                    Object obj4 = this.h;
                    ?? r6 = this.g;
                    upg upgVar = ((upc) obj3).f;
                    uom uomVar = new uom(r6, (File) obj, uop.a, (uoj) obj4);
                    uon uonVar = upgVar.d;
                    ArrayList arrayList = uonVar.a;
                    if (uonVar.b < arrayList.size() - 1) {
                        arrayList.subList(uonVar.b + 1, arrayList.size()).clear();
                    }
                    boolean z = this.a;
                    aami aamiVarE = uonVar.e();
                    if (!z || aamiVarE == null) {
                        aamiVarE = new aami(uomVar, uonVar.c);
                        arrayList.add(aamiVarE);
                    } else {
                        ((ArrayList) aamiVarE.b).add(uomVar);
                    }
                    uonVar.c = ((ArrayList) aamiVarE.b).size() - 1;
                    uonVar.b = arrayList.size() - 1;
                    if (!z) {
                        upgVar.q("", false);
                    }
                }
                upg upgVar2 = ((upc) obj3).f;
                ImageView imageViewD = upgVar2.d();
                imageViewD.getClass();
                imageViewD.setImageBitmap((Bitmap) obj2);
                upgVar2.r();
                uoo uooVar = upgVar2.l;
                uooVar.getClass();
                Optional optionalB = uooVar.b.b();
                uhe uheVar = new uhe(uooVar, 14);
                if (true == optionalB.isPresent()) {
                    uom uomVar2 = (uom) optionalB.get();
                    uoo uooVar2 = (uoo) uheVar.a;
                    uooVar2.c = uomVar2.c;
                    uooVar2.d(uomVar2.d.a);
                    uooVar2.a();
                }
            }
            ((upc) obj3).f.p(false);
            return;
        }
        if (i != 1) {
            int i3 = zpk.a;
            Object obj5 = this.h;
            Object obj6 = this.g;
            if (true == this.a) {
                r0 = obj5;
                r0 = obj6;
            }
            r0 = obj5;
            Object obj7 = this.b;
            ?? r2 = (zoz) obj7;
            r2.setText(r0);
            assy assyVar = (assy) this.d;
            if (assyVar.A) {
                r2.l((Context) this.e, this.f, (adsa) this.c, assyVar);
            }
            if (!assyVar.k) {
                r2.clearFocus();
                return;
            } else {
                r2.requestFocus();
                r2.setSelection(((AppCompatEditText) obj7).getText().length());
                return;
            }
        }
        int i4 = oqu.t;
        Object obj8 = this.f;
        NodeTreeProcessor nodeTreeProcessor = ((oyk) obj8).w;
        final ?? r4 = this.b;
        if (r4 == nodeTreeProcessor) {
            final ?? r9 = this.d;
            ElementsServices elementsServicesK = r4.k();
            oph ophVarL = r4.l();
            final ArrayList arrayList2 = new ArrayList();
            oqy oqyVarJ = r9.j();
            while (true) {
                r10 = this.h;
                if (!oqyVarJ.b() || i2 >= r10.a()) {
                    break;
                }
                opl oplVarA = opl.a(elementsServicesK.L().io().b(ophVarL));
                zj zjVar = new zj(r10.b(i2));
                zjVar.c = oplVarA;
                Object obj9 = zjVar.c;
                if (obj9 != null) {
                    ((opl) obj9).c().F((atgg) zjVar.b, r9.i(), r9.h(), zjVar.a());
                }
                arrayList2.add(zjVar);
                Size sizeG = oplVarA.c().g();
                if (sizeG != null) {
                    oqyVarJ.a(sizeG);
                }
                i2++;
            }
            Object obj10 = this.c;
            final boolean z2 = this.a;
            Object obj11 = this.g;
            final oqu oquVar = (oqu) obj8;
            final np npVar = (np) this.e;
            final RecyclerView recyclerView = (RecyclerView) obj11;
            final oqr oqrVar = (oqr) obj10;
            oquVar.c.post(new Runnable() { // from class: oqk
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
                    NodeTreeProcessor nodeTreeProcessor2;
                    mqt mqtVarJ;
                    oqj oqjVar;
                    int i5 = oqu.t;
                    NodeTreeProcessor nodeTreeProcessor3 = r4;
                    List list = arrayList2;
                    oqu oquVar2 = oquVar;
                    if (nodeTreeProcessor3 == oquVar2.w) {
                        RecyclerView recyclerView2 = recyclerView;
                        np npVar2 = npVar;
                        if (npVar2 == recyclerView2.n && oquVar2.r == 2) {
                            aga agaVar = ElementsServices.a;
                            if (Memory.peekByte(FlagServices.b().c + 70) != 0 && (oqjVar = oquVar2.g) != null) {
                                oqjVar.z();
                            }
                            oqj oqjVar2 = new oqj(nodeTreeProcessor3.k(), nodeTreeProcessor3.l(), r9, r10, list);
                            ovk ovkVar = new ovk(oqjVar2, nus.a(npVar2));
                            ovk ovkVar2 = oquVar2.h;
                            if (Memory.peekByte(FlagServices.b().c + 82) != 0) {
                                if (ovkVar2 != null) {
                                    if (oquVar2.f) {
                                        ovkVar2.p();
                                        ovkVar2.o();
                                    } else {
                                        recyclerView2.aE(ovkVar2);
                                    }
                                }
                            } else if (ovkVar2 != null && oquVar2.f) {
                                ovkVar2.p();
                                ovkVar2.o();
                            }
                            boolean z3 = z2;
                            oquVar2.g = oqjVar2;
                            oquVar2.h = ovkVar;
                            recyclerView2.ad(oqjVar2);
                            if (z3 && (nodeTreeProcessor2 = oquVar2.w) != null) {
                                oqz oqzVar = oquVar2.i;
                                if (oqzVar != null && (mqtVarJ = nodeTreeProcessor2.j(oquVar2)) != null) {
                                    aihl aihlVarCheckIsLite = aihn.checkIsLite(mqs.b);
                                    mqtVarJ.c(aihlVarCheckIsLite);
                                    Object objK = mqtVarJ.j.k(aihlVarCheckIsLite.d);
                                    oqzVar.e((mqs) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)), oquVar2.getContext());
                                }
                                String strAt = oquVar2.at(nodeTreeProcessor2);
                                if (!ahno.aa(strAt)) {
                                    oquVar2.h().h().f(strAt, oquVar2.b);
                                }
                            }
                            if (Memory.peekByte(FlagServices.b().c + 82) == 0) {
                                recyclerView2.A();
                            }
                            if (!oquVar2.f) {
                                recyclerView2.aC(ovkVar);
                            } else if (ovkVar.d != recyclerView2) {
                                ovkVar.p();
                                ovkVar.d = recyclerView2;
                                recyclerView2.aC(ovkVar);
                                View.OnLayoutChangeListener jfxVar = ovkVar.c;
                                if (jfxVar == null) {
                                    jfxVar = new jfx(ovkVar, 6);
                                    ovkVar.c = jfxVar;
                                }
                                recyclerView2.addOnLayoutChangeListener(jfxVar);
                                nh nhVar = recyclerView2.m;
                                if (nhVar != null) {
                                    nhVar.x(ovkVar.u());
                                    ovkVar.e = nhVar;
                                }
                            }
                            if (recyclerView2.getChildCount() > 0) {
                                ovkVar.e(recyclerView2, 0, 0);
                            } else {
                                recyclerView2.post(new msh(oquVar2, recyclerView2, 15, null));
                            }
                            atbv atbvVar = oqrVar.c;
                            oquVar2.K(atbvVar);
                            oquVar2.ad(atbvVar);
                            oquVar2.ac(atbvVar);
                            oquVar2.r = 3;
                            oquVar2.J(atbvVar);
                            return;
                        }
                    }
                    aga agaVar2 = ElementsServices.a;
                    if (Memory.peekByte(FlagServices.b().c + 70) != 0) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((zj) it.next()).b(new oqe(nodeTreeProcessor3, 2), true);
                        }
                    }
                }
            });
        }
    }

    public /* synthetic */ upa(upc upcVar, upd updVar, File file, Bitmap bitmap, Optional optional, uoi uoiVar, uoj uojVar, boolean z, int i) {
        this.$cid = i;
        this.b = upcVar;
        this.c = updVar;
        this.d = file;
        this.e = bitmap;
        this.f = optional;
        this.g = uoiVar;
        this.h = uojVar;
        this.a = z;
    }

    public /* synthetic */ upa(zoz zozVar, boolean z, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, assy assyVar, Context context, aduv aduvVar, adsa adsaVar, int i) {
        this.$cid = i;
        this.b = zozVar;
        this.a = z;
        this.g = spannableStringBuilder;
        this.h = spannableStringBuilder2;
        this.d = assyVar;
        this.e = context;
        this.f = aduvVar;
        this.c = adsaVar;
    }
}
