package defpackage;

import android.graphics.Rect;
import com.google.android.libraries.elements.interfaces.IntersectionCriteria;
import com.google.protos.youtube.elements.IntersectionPropertiesOuterClass$IntersectionObserverConfig;
import io.grpc.Status;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mnj extends mnl {
    public final nry a;
    public boolean b;
    public omj c;
    private final ArrayList f;
    private IntersectionCriteria g;
    private IntersectionCriteria h;
    private long i;
    private boolean j;
    private avmn k;
    private omj l;
    private omj m;

    public mnj(ncw ncwVar, nry nryVar, nrv nrvVar, omj omjVar) {
        super(nrvVar);
        this.a = nryVar;
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        if (ncwVar.m()) {
            IntersectionCriteria intersectionCriteriaU = omj.u(ncwVar.k());
            this.g = intersectionCriteriaU;
            arrayList.add(intersectionCriteriaU);
        }
        if (ncwVar.n()) {
            IntersectionCriteria intersectionCriteriaU2 = omj.u(ncwVar.l());
            this.h = intersectionCriteriaU2;
            arrayList.add(intersectionCriteriaU2);
        }
        if (this.g == null || this.h == null) {
            arrayList.clear();
            return;
        }
        nsl nslVar = this.d.i;
        if (ncwVar.q()) {
            this.l = omjVar.B(ncwVar.j(), nslVar);
        }
        if (ncwVar.o()) {
            this.m = omjVar.B(ncwVar.h(), nslVar);
        }
        if (ncwVar.p()) {
            this.c = omjVar.B(ncwVar.i(), nslVar);
        }
        this.i = Math.max(ncwVar.g(), 0);
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final Status criteriaMatched(ArrayList arrayList) {
        omj omjVar;
        if (arrayList.isEmpty()) {
            return Status.d;
        }
        nrv nrvVarA = a();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            IntersectionCriteria intersectionCriteria = (IntersectionCriteria) arrayList.get(i);
            if (Objects.equals(intersectionCriteria, this.g)) {
                if (!this.j) {
                    int i2 = 1;
                    this.j = true;
                    omj omjVar2 = this.l;
                    if (omjVar2 != null) {
                        avlb avlbVarA = this.a.a(omjVar2.x(), nrvVarA);
                        avmb avmbVar = awlg.c;
                        avnn avnnVar = atqp.i;
                        avlbVarA.r(avmbVar).D();
                    }
                    if (this.c != null) {
                        avmn avmnVarAf = avlr.ab(this.i, TimeUnit.MILLISECONDS).af(new mnt(this, nrvVarA, i2));
                        this.k = avmnVarAf;
                        avnq avnqVar = b().i;
                        if (avnqVar != null) {
                            avnqVar.c(avmnVarAf);
                        }
                    }
                }
            } else if (Objects.equals(intersectionCriteria, this.h)) {
                Object obj = this.k;
                if (obj != null) {
                    avnr.b((AtomicReference) obj);
                }
                if (this.j && !this.b && (omjVar = this.m) != null) {
                    this.a.a(omjVar.x(), nrvVarA).D();
                }
                this.j = false;
                this.b = false;
            }
        }
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final ArrayList getCriteriaList() {
        return this.f;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final IntersectionPropertiesOuterClass$IntersectionObserverConfig getCustomConfig() {
        return null;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final String getGroupId() {
        return "";
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
