package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import app.rive.semantics.SemanticState;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class esn extends fdu implements Cloneable {
    private esn A;
    private esn B;
    private Float C;
    private boolean D = true;
    private boolean E;
    private boolean F;
    private final Context t;
    private final esq u;
    private final Class v;
    private final esc w;
    private esr x;
    private Object y;
    private List z;

    static {
    }

    protected esn(erj erjVar, esq esqVar, Class cls, Context context) {
        this.u = esqVar;
        this.v = cls;
        this.t = context;
        esc escVar = esqVar.a.b;
        esr esrVar = (esr) escVar.c.get(cls);
        if (esrVar == null) {
            for (Map.Entry entry : escVar.c.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    esrVar = (esr) entry.getValue();
                }
            }
        }
        this.x = esrVar == null ? esc.a : esrVar;
        this.w = erjVar.b;
        Iterator it = esqVar.d.iterator();
        while (it.hasNext()) {
            a((feb) it.next());
        }
        l(esqVar.h());
    }

    private final esn U(esn esnVar) {
        PackageInfo packageInfo;
        Context context = this.t;
        esn esnVar2 = (esn) esnVar.J(context.getTheme());
        ConcurrentMap concurrentMap = ffb.a;
        String packageName = context.getPackageName();
        ett ettVar = (ett) ffb.a.get(packageName);
        if (ettVar == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("AppVersionSignature", "Cannot resolve info for".concat(String.valueOf(context.getPackageName())), e);
                packageInfo = null;
            }
            ffd ffdVar = new ffd(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            ettVar = (ett) ffb.a.putIfAbsent(packageName, ffdVar);
            if (ettVar == null) {
                ettVar = ffdVar;
            }
        }
        return (esn) esnVar2.H(new ffa(context.getResources().getConfiguration().uiMode & 48, ettVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [esn, fdu] */
    /* JADX WARN: Type inference failed for: r0v9, types: [esn, fdu] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [fdx] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r4v2, types: [fdv, fdz] */
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
    private final fdx V(Object obj, fem femVar, feb febVar, fdz fdzVar, esr esrVar, esf esfVar, int i, int i2, fdu fduVar, Executor executor) {
        ?? r11;
        fdz fdvVar;
        fdx fdxVarW;
        esf esfVar2;
        esn esnVar = this;
        fdu fduVar2 = fduVar;
        if (esnVar.B != null) {
            fdvVar = new fdv(obj, fdzVar);
            r11 = fdvVar;
        } else {
            r11 = 0;
            fdvVar = fdzVar;
        }
        esn esnVar2 = esnVar.A;
        if (esnVar2 == null) {
            fdxVarW = esnVar.W(obj, femVar, febVar, fduVar2, fdvVar, esrVar, esfVar, i, i2, executor);
        } else {
            if (esnVar.F) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            esr esrVar2 = true == esnVar2.D ? esrVar : esnVar2.x;
            if (super.N(8)) {
                esfVar2 = esnVar2.c;
            } else {
                int i3 = esm.b[esfVar.ordinal()];
                if (i3 == 1) {
                    esfVar2 = esf.c;
                } else if (i3 == 2) {
                    esfVar2 = esf.b;
                } else {
                    if (i3 != 3 && i3 != 4) {
                        throw new IllegalArgumentException("unknown priority: ".concat(String.valueOf(String.valueOf(esnVar.c))));
                    }
                    esfVar2 = esf.a;
                }
            }
            esf esfVar3 = esfVar2;
            esn esnVar3 = esnVar.A;
            int i4 = esnVar3.j;
            int i5 = esnVar3.i;
            if (ffs.i(i, i2) && !esnVar.A.O()) {
                i4 = fduVar2.j;
                i5 = fduVar2.i;
            }
            int i6 = i5;
            fee feeVar = new fee(obj, fdvVar);
            fdx fdxVarW2 = esnVar.W(obj, femVar, febVar, fduVar2, feeVar, esrVar, esfVar, i, i2, executor);
            esnVar.F = true;
            ?? r0 = esnVar.A;
            fdx fdxVarV = r0.V(obj, femVar, febVar, feeVar, esrVar2, esfVar3, i4, i6, r0, executor);
            fee feeVar2 = feeVar;
            esnVar.F = false;
            feeVar2.a = fdxVarW2;
            feeVar2.b = fdxVarV;
            fduVar2 = fduVar;
            esnVar = esnVar;
            fdxVarW = feeVar2;
        }
        fdx fdxVar = fdxVarW;
        if (r11 == 0) {
            return fdxVar;
        }
        esn esnVar4 = esnVar.B;
        int i7 = esnVar4.j;
        int i8 = esnVar4.i;
        if (ffs.i(i, i2) && !esnVar.B.O()) {
            i7 = fduVar2.j;
            i8 = fduVar2.i;
        }
        ?? r1 = esnVar.B;
        ?? r4 = r11;
        fdx fdxVarV2 = r1.V(obj, femVar, febVar, r4, r1.x, r1.c, i7, i8, r1, executor);
        r4.a = fdxVar;
        r4.b = fdxVarV2;
        return r11;
    }

    private final fdx W(Object obj, fem femVar, feb febVar, fdu fduVar, fdz fdzVar, esr esrVar, esf esfVar, int i, int i2, Executor executor) {
        Object obj2 = this.y;
        List list = this.z;
        few fewVar = esrVar.a;
        Context context = this.t;
        Class cls = this.v;
        esc escVar = this.w;
        return new fed(context, escVar, obj, obj2, cls, fduVar, i, i2, esfVar, femVar, febVar, list, fdzVar, escVar.g, fewVar, executor);
    }

    public esn a(feb febVar) {
        if (this.q) {
            return clone().a(febVar);
        }
        if (febVar != null) {
            if (this.z == null) {
                this.z = new ArrayList();
            }
            this.z.add(febVar);
        }
        S();
        return this;
    }

    @Override // defpackage.fdu
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public esn l(fdu fduVar) {
        if (fduVar != null) {
            return (esn) super.l(fduVar);
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // defpackage.fdu
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public esn clone() {
        esn esnVar = (esn) super.clone();
        esnVar.x = esnVar.x.clone();
        List list = esnVar.z;
        if (list != null) {
            esnVar.z = new ArrayList(list);
        }
        esn esnVar2 = esnVar.A;
        if (esnVar2 != null) {
            esnVar.A = esnVar2.clone();
        }
        esn esnVar3 = esnVar.B;
        if (esnVar3 != null) {
            esnVar.B = esnVar3.clone();
        }
        return esnVar;
    }

    public esn d(feb febVar) {
        if (this.q) {
            return clone().d(febVar);
        }
        this.z = null;
        return a(febVar);
    }

    public esn e(Drawable drawable) {
        return j(drawable).l(fec.b(evs.b));
    }

    @Override // defpackage.fdu
    public final boolean equals(Object obj) {
        if (!(obj instanceof esn)) {
            return false;
        }
        esn esnVar = (esn) obj;
        if (!super.equals(esnVar) || !Objects.equals(this.v, esnVar.v) || !this.x.equals(esnVar.x) || !Objects.equals(this.y, esnVar.y) || !Objects.equals(this.z, esnVar.z) || !Objects.equals(this.A, esnVar.A) || !Objects.equals(this.B, esnVar.B)) {
            return false;
        }
        Float f = esnVar.C;
        return Objects.equals(null, null) && this.D == esnVar.D && this.E == esnVar.E;
    }

    public esn f(Uri uri) {
        esn esnVarJ = j(uri);
        return (uri == null || !"android.resource".equals(uri.getScheme())) ? esnVarJ : U(esnVarJ);
    }

    public esn g(Integer num) {
        return U(j(num));
    }

    public esn h(Object obj) {
        return j(obj);
    }

    @Override // defpackage.fdu
    public final int hashCode() {
        return (((ffs.c(null, ffs.c(this.B, ffs.c(this.A, ffs.c(this.z, ffs.c(this.y, ffs.c(this.x, ffs.c(this.v, super.hashCode()))))))) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0);
    }

    public esn i(byte[] bArr) {
        esn esnVarJ = j(bArr);
        if (!super.N(4)) {
            esnVarJ = esnVarJ.l(fec.b(evs.b));
        }
        if (super.N(SemanticState.Hidden)) {
            return esnVarJ;
        }
        if (fec.t == null) {
            fec.t = (fec) ((fec) new fec().I(true)).r();
        }
        return esnVarJ.l(fec.t);
    }

    public final esn j(Object obj) {
        if (this.q) {
            return clone().j(obj);
        }
        this.y = obj;
        this.E = true;
        S();
        return this;
    }

    public esn k(esr esrVar) {
        if (this.q) {
            return clone().k(esrVar);
        }
        if (esrVar == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.x = esrVar;
        this.D = false;
        S();
        return this;
    }

    public final void n(fem femVar, feb febVar, fdu fduVar, Executor executor) {
        if (femVar == null) {
            throw new NullPointerException("Argument must not be null");
        }
        if (!this.E) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        fdx fdxVarV = V(new Object(), femVar, febVar, null, this.x, fduVar.c, fduVar.j, fduVar.i, fduVar, executor);
        fdx fdxVarD = femVar.d();
        if (!fdxVarV.m(fdxVarD) || (!fduVar.h && fdxVarD.l())) {
            esq esqVar = this.u;
            esqVar.j(femVar);
            femVar.f(fdxVarV);
            esqVar.q(femVar, fdxVarV);
            return;
        }
        if (fdxVarD == null) {
            throw new NullPointerException("Argument must not be null");
        }
        if (fdxVarD.n()) {
            return;
        }
        fdxVarD.b();
    }

    public final void o(int i, int i2) {
        q(new fel(this.u, i, i2));
    }

    public final fea p() {
        fea feaVar = new fea();
        n(feaVar, feaVar, this, ffk.b);
        return feaVar;
    }

    public final void q(fem femVar) {
        n(femVar, null, this, ffk.a);
    }
}
