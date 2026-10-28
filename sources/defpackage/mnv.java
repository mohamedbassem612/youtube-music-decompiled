package defpackage;

import android.graphics.Rect;
import com.google.android.libraries.elements.interfaces.IntersectionCriteria;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.elements.IntersectionPropertiesOuterClass$IntersectionObserverConfig;
import io.grpc.Status;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mnv extends mnl {
    public final nry a;
    public omj b;
    private final ArrayList c;
    private IntersectionCriteria f;
    private IntersectionCriteria g;
    private final String h;
    private long i;
    private IntersectionPropertiesOuterClass$IntersectionObserverConfig j;
    private boolean k;
    private avmn l;
    private omj m;
    private omj n;

    public mnv(ndg ndgVar, nry nryVar, nrv nrvVar, omj omjVar, boolean z) {
        super(nrvVar);
        this.a = nryVar;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        nsl nslVar = this.d.i;
        if (ndgVar.s()) {
            IntersectionCriteria intersectionCriteriaU = omj.u(ndgVar.k());
            this.f = intersectionCriteriaU;
            arrayList.add(intersectionCriteriaU);
            if (ndgVar.q()) {
                this.m = omjVar.B(ndgVar.i(), nslVar);
            }
            if (ndgVar.p()) {
                this.b = omjVar.B(ndgVar.h(), nslVar);
                this.i = Math.max(ndgVar.g(), 0);
            }
        }
        if (ndgVar.t()) {
            IntersectionCriteria intersectionCriteriaU2 = omj.u(ndgVar.l());
            this.g = intersectionCriteriaU2;
            arrayList.add(intersectionCriteriaU2);
            if (ndgVar.r()) {
                this.n = omjVar.B(ndgVar.j(), nslVar);
            }
        } else {
            IntersectionCriteria intersectionCriteria = this.f;
            if (intersectionCriteria != null) {
                IntersectionCriteria intersectionCriteria2 = new IntersectionCriteria(intersectionCriteria.getRatio(), false);
                this.g = intersectionCriteria2;
                arrayList.add(intersectionCriteria2);
            }
        }
        this.h = ahno.Z(ndgVar.n());
        if (z && ndgVar.o()) {
            try {
                this.j = (IntersectionPropertiesOuterClass$IntersectionObserverConfig) aihn.parseFrom(IntersectionPropertiesOuterClass$IntersectionObserverConfig.a, ndgVar.m().f(), ExtensionRegistryLite.getGeneratedRegistry());
            } catch (aiik unused) {
                this.j = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final void c() {
        avmn avmnVar = this.l;
        if (avmnVar != 0) {
            avnr.b((AtomicReference) avmnVar);
            avnq avnqVar = b().i;
            if (avnqVar != null) {
                avnqVar.h(avmnVar);
            }
            this.l = null;
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final Status criteriaMatched(ArrayList arrayList) {
        omj omjVar;
        if (arrayList.isEmpty()) {
            return Status.d;
        }
        nrv nrvVarA = a();
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            IntersectionCriteria intersectionCriteria = (IntersectionCriteria) arrayList.get(i2);
            if (Objects.equals(intersectionCriteria, this.f)) {
                if (!this.k) {
                    this.k = true;
                    omj omjVar2 = this.m;
                    if (omjVar2 != null) {
                        this.a.a(omjVar2.x(), nrvVarA).D();
                    }
                    if (this.b != null) {
                        avmn avmnVarAf = avlr.ab(this.i, TimeUnit.MILLISECONDS).O(mnu.a).af(new mnt(this, nrvVarA, i));
                        this.l = avmnVarAf;
                        avnq avnqVar = b().i;
                        if (avnqVar != null) {
                            avnqVar.c(avmnVarAf);
                        }
                    }
                }
            } else if (Objects.equals(intersectionCriteria, this.g)) {
                c();
                if (this.k && (omjVar = this.n) != null) {
                    this.a.a(omjVar.x(), nrvVarA).D();
                }
                this.k = false;
            }
        }
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final ArrayList getCriteriaList() {
        return this.c;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final IntersectionPropertiesOuterClass$IntersectionObserverConfig getCustomConfig() {
        return this.j;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final String getGroupId() {
        return this.h;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final Status isProminentCandidate(boolean z) {
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final boolean needContinuousUpdate() {
        return false;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final Status visibilityChanged(float f, Rect rect, Rect rect2) {
        return Status.OK;
    }
}
