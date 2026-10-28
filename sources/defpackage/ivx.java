package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ivx implements View.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public ivx(hhj hhjVar, String str, Activity activity, int i) {
        this.$cid = i;
        this.c = str;
        this.b = activity;
        this.a = hhjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, xgn] */
    /* JADX WARN: Type inference failed for: r1v11, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, xgn] */
    /* JADX WARN: Type inference failed for: r1v48, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, xgm] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r6v45, types: [java.lang.Object, xgz] */
    /* JADX WARN: Type inference failed for: r6v51, types: [java.lang.Object, xgz] */
    /* JADX WARN: Type inference failed for: r6v52, types: [java.lang.Object, xgz] */
    /* JADX WARN: Type inference failed for: r6v58, types: [java.lang.Object, xgz] */
    /* JADX WARN: Type inference failed for: r7v37, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Object, xgn] */
    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Object, xgz] */
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
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ajwo ajwoVar;
        ajwo ajwoVar2 = null;
        ajwo ajwoVar3 = null;
        switch (this.$cid) {
            case 0:
                Object obj = this.b;
                qcb qcbVar = ((ivw) obj).f;
                Object obj2 = this.a;
                if (qcbVar != null) {
                    for (Map.Entry entry : ((ivy) obj2).g.entrySet()) {
                        if (((CheckBox) entry.getValue()).isChecked()) {
                            qcbVar.p((ajwo) ((auzk) entry.getKey()).b);
                        }
                    }
                }
                Object obj3 = this.c;
                if (obj3 != null) {
                    ajnf ajnfVar = (ajnf) obj3;
                    if ((ajnfVar.b & SemanticState.Modal) != 0) {
                        vxe vxeVar = ((ivy) obj2).b;
                        ajwo ajwoVar4 = ajnfVar.q;
                        if (ajwoVar4 == null) {
                            ajwoVar4 = ajwo.a;
                        }
                        vxeVar.c(ajwoVar4, xhd.h(obj, true));
                    }
                    if ((ajnfVar.b & SemanticState.Obscured) != 0) {
                        vxe vxeVar2 = ((ivy) obj2).b;
                        ajwo ajwoVar5 = ajnfVar.r;
                        if (ajwoVar5 == null) {
                            ajwoVar5 = ajwo.a;
                        }
                        vxeVar2.c(ajwoVar5, xhd.h(obj, true));
                    }
                }
                ((ivy) obj2).b();
                return;
            case 1:
                ahng.x(((iqg) ((hhj) this.a).c.io()).b((String) this.c, ailn.GRANTED), afwl.g(new hhi(this, this.b, 0, null)), MoreExecutors.directExecutor());
                return;
            case 2:
                qcb qcbVar2 = ((ivw) this.b).f;
                if (qcbVar2 != null) {
                    aqgs aqgsVar = (aqgs) this.c;
                    if ((aqgsVar.b & 4) != 0 && (ajwoVar2 = aqgsVar.e) == null) {
                        ajwoVar2 = ajwo.a;
                    }
                    qcbVar2.p(ajwoVar2);
                }
                ((ivy) this.a).b();
                return;
            case 3:
                Object obj4 = this.a;
                ameb amebVar = ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK;
                xgj xgjVar = new xgj(((ajnf) obj4).y, (amud) null);
                Object obj5 = this.b;
                ((adtv) obj5).ag.o(amebVar, xgjVar, null);
                ((jav) obj5).g.a((ajwo) this.c);
                return;
            case 4:
                Map mapZ = atqq.z(new awml("com.google.android.libraries.youtube.innertube.endpoint.tag", this.c));
                ajnf ajnfVar2 = (ajnf) this.a;
                int i = ajnfVar2.b;
                int i2 = i & SemanticState.Obscured;
                Object obj6 = this.b;
                if (i2 != 0) {
                    vxe vxeVar3 = (vxe) ((jij) obj6).b.io();
                    ajwo ajwoVar6 = ajnfVar2.r;
                    if (ajwoVar6 == null) {
                        ajwoVar6 = ajwo.a;
                    }
                    vxeVar3.c(ajwoVar6, mapZ);
                } else if ((i & SemanticState.Modal) != 0) {
                    vxe vxeVar4 = (vxe) ((jij) obj6).b.io();
                    ajwo ajwoVar7 = ajnfVar2.q;
                    if (ajwoVar7 == null) {
                        ajwoVar7 = ajwo.a;
                    }
                    vxeVar4.c(ajwoVar7, mapZ);
                } else if ((i & SemanticState.Multiline) != 0) {
                    vxe vxeVar5 = (vxe) ((jij) obj6).b.io();
                    ajwo ajwoVar8 = ajnfVar2.s;
                    if (ajwoVar8 == null) {
                        ajwoVar8 = ajwo.a;
                    }
                    vxeVar5.c(ajwoVar8, mapZ);
                }
                ((jij) obj6).c.hB().o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(ajnfVar2.y.G()), null);
                return;
            case 5:
                Map mapZ2 = atqq.z(new awml("com.google.android.libraries.youtube.innertube.endpoint.tag", this.c));
                vxe vxeVar6 = (vxe) ((jij) this.b).b.io();
                ajwo ajwoVar9 = ((aoda) this.a).e;
                if (ajwoVar9 == null) {
                    ajwoVar9 = ajwo.a;
                }
                vxeVar6.c(ajwoVar9, mapZ2);
                return;
            case 6:
                rln rlnVar = (rln) this.b;
                xgz xgzVar = rlnVar.b;
                if (xgzVar != null) {
                    this.c.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, xgzVar, null);
                }
                ?? r6 = this.a;
                if (r6 == 0 || (ajwoVar = rlnVar.c) == null) {
                    return;
                }
                r6.a(ajwoVar);
                rlnVar.a.h();
                return;
            case 7:
                Object obj7 = this.a;
                roe roeVar = (roe) this.b;
                roeVar.i((xgj) obj7);
                ajwo ajwoVar10 = ((ajnf) this.c).s;
                if (ajwoVar10 == null) {
                    ajwoVar10 = ajwo.a;
                }
                roeVar.f.a(ajwoVar10);
                return;
            case 8:
                byte[] bArrG = ((akbg) this.c).i.G();
                ?? r0 = this.a;
                if (r0 != 0) {
                    r0.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(bArrG), null);
                }
                rpl rplVar = (rpl) this.b;
                rplVar.d.f(rplVar.a, new sdo(rplVar.h, rplVar.e, rplVar.c, (ajwo) null));
                return;
            case 9:
                ajnf ajnfVar3 = (ajnf) this.a;
                int i3 = ajnfVar3.b;
                if ((i3 & SemanticState.Modal) != 0) {
                    ajwoVar3 = ajnfVar3.q;
                    if (ajwoVar3 == null) {
                        ajwoVar3 = ajwo.a;
                    }
                } else if ((i3 & SemanticState.Obscured) != 0 && (ajwoVar3 = ajnfVar3.r) == null) {
                    ajwoVar3 = ajwo.a;
                }
                ((xsc) this.b).c.c(ajwoVar3, this.c);
                return;
            case 10:
                ssv ssvVar = (ssv) this.c;
                aeaj aeajVar = ssvVar.e;
                if (!aeajVar.e) {
                    Object obj8 = this.a;
                    ssvVar.h();
                    ssvVar.g.setImageDrawable((Drawable) obj8);
                    return;
                } else {
                    Object obj9 = this.b;
                    aeajVar.d();
                    EditText editText = ssvVar.f;
                    editText.requestFocus();
                    tuk.m(editText);
                    ssvVar.g.setImageDrawable((Drawable) obj9);
                    return;
                }
            case 11:
                ssz sszVar = (ssz) this.c;
                aeaj aeajVar2 = sszVar.q;
                if (!aeajVar2.e) {
                    Object obj10 = this.a;
                    sszVar.q();
                    sszVar.t.setImageDrawable((Drawable) obj10);
                    return;
                } else {
                    Object obj11 = this.b;
                    aeajVar2.d();
                    sszVar.r.requestFocus();
                    tuk.m(sszVar.r);
                    sszVar.t.setImageDrawable((Drawable) obj11);
                    return;
                }
            case 12:
                upg upgVar = (upg) this.c;
                upgVar.l(293229);
                upd updVar = (upd) this.a;
                updVar.a.set(true);
                updVar.b.cancel(false);
                ((Button) this.b).setOnClickListener(null);
                upgVar.p(false);
                return;
            case 13:
                ((wzo) this.b).l((anfv) this.c, this.a);
                return;
            case 14:
                ajwo ajwoVar11 = ((amov) this.c).g;
                if (ajwoVar11 == null) {
                    ajwoVar11 = ajwo.a;
                }
                Object obj12 = this.b;
                ?? r7 = this.a;
                wzu wzuVar = (wzu) obj12;
                wzuVar.b.c(ajwoVar11, null);
                wzuVar.c.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, r7, null);
                return;
            case 15:
                ?? r8 = this.a;
                Object obj13 = this.b;
                if (r8 != 0) {
                    ((wzw) obj13).c.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, r8, null);
                }
                Object obj14 = this.c;
                vxe vxeVar7 = ((wzw) obj13).b;
                ajwo ajwoVar12 = ((amoy) obj14).m;
                if (ajwoVar12 == null) {
                    ajwoVar12 = ajwo.a;
                }
                vxeVar7.a(ajwoVar12);
                return;
            case 16:
                ajwo ajwoVar13 = ((ampq) this.c).q;
                if (ajwoVar13 == null) {
                    ajwoVar13 = ajwo.a;
                }
                wzy wzyVar = (wzy) this.b;
                wzyVar.a.c(ajwoVar13, wzyVar.m);
                wzyVar.b.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, this.a, null);
                return;
            case 17:
                ajwo ajwoVar14 = ((ampr) this.c).d;
                if (ajwoVar14 == null) {
                    ajwoVar14 = ajwo.a;
                }
                wzz wzzVar = (wzz) this.b;
                wzzVar.b.c(ajwoVar14, null);
                wzzVar.a.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, this.a, null);
                return;
            case 18:
                xbf xbfVar = (xbf) this.a;
                wxl wxlVar = xbfVar.m;
                if (wxlVar != null) {
                    wxlVar.d();
                }
                Editable editableG = xbfVar.g();
                amqw amqwVarA = !TextUtils.isEmpty(editableG) ? xbfVar.g.a(editableG) : null;
                Object tag = ((View) this.b).getTag();
                if (tag instanceof xgj) {
                    xbfVar.c.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, (xgj) tag, null);
                }
                Object obj15 = this.c;
                vxe vxeVar8 = xbfVar.d;
                ajwo ajwoVar15 = ((ajnf) obj15).s;
                if (ajwoVar15 == null) {
                    ajwoVar15 = ajwo.a;
                }
                vxeVar8.c(ajwoVar15, amqwVarA != null ? agkj.j("com.google.android.libraries.youtube.innertube.endpoint.tag", amqwVarA) : null);
                return;
            case 19:
                xbf xbfVar2 = (xbf) this.a;
                tuk.i(xbfVar2.x());
                Activity activity = xbfVar2.a;
                if (activity instanceof cf) {
                    xbfVar2.f.c = false;
                    xxj xxjVar = xbfVar2.T;
                    if (xxjVar != null) {
                        xxjVar.e();
                    }
                    wxl wxlVar2 = xbfVar2.m;
                    if (wxlVar2 != null) {
                        wxlVar2.d();
                    }
                    ?? r1 = this.b;
                    dd supportFragmentManager = ((cf) activity).getSupportFragmentManager();
                    wzp wzpVar = new wzp();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("picker_panel", r1);
                    wzpVar.setArguments(bundle);
                    xbfVar2.s = wzpVar;
                    xbfVar2.s.h(supportFragmentManager, "purchase_dialog_fragment");
                }
                xbfVar2.c.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, this.c, null);
                xbfVar2.o.g();
                xbfVar2.I();
                return;
            default:
                xue xueVar = (xue) this.c;
                Map map = xueVar.h;
                Object obj16 = this.b;
                dii diiVar = (dii) obj16;
                xueVar.z(diiVar, map);
                xueVar.a.remove(obj16);
                yds ydsVar = xueVar.e.e;
                String strA = xrx.a(diiVar);
                ydsVar.k(strA);
                ydsVar.j();
                ydsVar.h.readLock().lock();
                try {
                    boolean zContainsKey = ydsVar.g.containsKey(strA);
                    ReentrantReadWriteLock reentrantReadWriteLock = ydsVar.h;
                    reentrantReadWriteLock.readLock().unlock();
                    if (zContainsKey) {
                        reentrantReadWriteLock.readLock().lock();
                        try {
                            atpf atpfVar = (atpf) ydsVar.g.get(strA);
                            ReentrantReadWriteLock reentrantReadWriteLock2 = ydsVar.h;
                            reentrantReadWriteLock2.readLock().unlock();
                            if (atpfVar != null) {
                                aihf aihfVarCreateBuilder = atpf.a.createBuilder(atpfVar);
                                aihfVarCreateBuilder.copyOnWrite();
                                atpf atpfVar2 = (atpf) aihfVarCreateBuilder.instance;
                                atpfVar2.b |= 2;
                                atpfVar2.d = 0L;
                                atpf atpfVar3 = (atpf) aihfVarCreateBuilder.build();
                                reentrantReadWriteLock2.writeLock().lock();
                                try {
                                    ydsVar.g.put(strA, atpfVar3);
                                    ydsVar.h.writeLock().unlock();
                                } catch (Throwable th) {
                                    ydsVar.h.writeLock().unlock();
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            ydsVar.h.readLock().unlock();
                            throw th2;
                        }
                    }
                    ((nh) this.c).n(((oh) this.a).b());
                    return;
                } catch (Throwable th3) {
                    ydsVar.h.readLock().unlock();
                    throw th3;
                }
        }
    }

    public ivx(Object obj, aihn aihnVar, xgj xgjVar, int i) {
        this.$cid = i;
        this.c = aihnVar;
        this.a = xgjVar;
        this.b = obj;
    }

    public /* synthetic */ ivx(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ ivx(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ ivx(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ ivx(Object obj, Object obj2, Object obj3, int i, int[] iArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ ivx(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public ivx(xue xueVar, dii diiVar, xuc xucVar, int i) {
        this.$cid = i;
        this.b = diiVar;
        this.a = xucVar;
        this.c = xueVar;
    }
}
