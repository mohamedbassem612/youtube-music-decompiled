package defpackage;

import android.graphics.Rect;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.elements.interfaces.IntersectionCriteria;
import com.google.protos.youtube.elements.IntersectionPropertiesOuterClass$IntersectionCriteria;
import com.google.protos.youtube.elements.IntersectionPropertiesOuterClass$IntersectionObserverConfig;
import io.grpc.Status;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adfz extends mnl {
    private final Map a;
    private final ArrayList b;
    private final xgn c;
    private final xgz f;
    private final amdd g;
    private final nsl h;
    private final nuc i;
    private final mbc j;

    public adfz(xgn xgnVar, amud amudVar, amdd amddVar, nrv nrvVar, nuc nucVar, mbc mbcVar) {
        super(nrvVar);
        this.b = new ArrayList();
        xgnVar.getClass();
        this.c = xgnVar;
        nsl nslVar = nrvVar.i;
        nslVar.getClass();
        this.h = nslVar;
        this.i = nucVar;
        this.j = mbcVar;
        amudVar.getClass();
        this.f = new xgj(amudVar);
        this.g = amddVar;
        this.a = new HashMap();
        if ((amudVar.c & 64) == 0) {
            nucVar.c(aslh.LOG_TYPE_INVALID_FIELD, nslVar, "Fvl Config is not available in LoggingDirectives", new Object[0]);
            return;
        }
        atqc atqcVar = amudVar.i;
        atqcVar = atqcVar == null ? atqc.a : atqcVar;
        if ((atqcVar.b & 1) != 0) {
            atqd atqdVar = atqcVar.c;
            c(atqdVar == null ? atqd.a : atqdVar, "primary_fvl_spec");
        }
        if ((atqcVar.b & 2) != 0) {
            atqd atqdVar2 = atqcVar.d;
            c(atqdVar2 == null ? atqd.a : atqdVar2, "secondary_fvl_spec");
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c8  */
    private final void c(atqd atqdVar, String str) {
        float f;
        if ((atqdVar.b & 1) != 0) {
            atqg atqgVar = atqdVar.c;
            if (atqgVar == null) {
                atqgVar = atqg.a;
            }
            int i = atqgVar.d;
            if (i < 0) {
                aihf aihfVarCreateBuilder = asnc.a.createBuilder();
                aslh aslhVar = aslh.LOG_TYPE_INVALID_FIELD;
                aihfVarCreateBuilder.copyOnWrite();
                asnc asncVar = (asnc) aihfVarCreateBuilder.instance;
                asncVar.d = aslhVar.I;
                asncVar.b |= 2;
                aihfVarCreateBuilder.copyOnWrite();
                asnc asncVar2 = (asnc) aihfVarCreateBuilder.instance;
                asncVar2.b |= SemanticState.LiveRegion;
                asncVar2.m = i;
                this.i.d((asnc) aihfVarCreateBuilder.build(), this.h, "Invalid minimum visibility duration for FVL config.", new Object[0]);
            }
            if ((atqgVar.b & 1) == 0) {
                f = 0.0f;
            } else {
                atqf atqfVar = atqgVar.c;
                if (atqfVar == null) {
                    atqfVar = atqf.a;
                }
                aihl aihlVar = IntersectionPropertiesOuterClass$IntersectionCriteria.b;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                atqfVar.c(aihlVarCheckIsLite);
                if (atqfVar.j.n(aihlVarCheckIsLite.d)) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                    atqfVar.c(aihlVarCheckIsLite2);
                    Object objK = atqfVar.j.k(aihlVarCheckIsLite2.d);
                    f = ((IntersectionPropertiesOuterClass$IntersectionCriteria) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).c;
                    if (f <= 0.0f || f > 1.0f) {
                        aihf aihfVarCreateBuilder2 = asnc.a.createBuilder();
                        aslh aslhVar2 = aslh.LOG_TYPE_INVALID_FIELD;
                        aihfVarCreateBuilder2.copyOnWrite();
                        asnc asncVar3 = (asnc) aihfVarCreateBuilder2.instance;
                        asncVar3.d = aslhVar2.I;
                        asncVar3.b |= 2;
                        aihfVarCreateBuilder2.copyOnWrite();
                        asnc asncVar4 = (asnc) aihfVarCreateBuilder2.instance;
                        asncVar4.b |= SemanticState.Obscured;
                        asncVar4.p = f;
                        this.i.d((asnc) aihfVarCreateBuilder2.build(), this.h, "Invalid ratio for FVL config.", new Object[0]);
                        f = 0.0f;
                    }
                } else {
                    f = 0.0f;
                }
            }
            long j = i;
            if (j < 0 || f <= 0.0f || f > 1.0f) {
                return;
            }
            IntersectionCriteria intersectionCriteria = new IntersectionCriteria(f, true);
            IntersectionCriteria intersectionCriteria2 = new IntersectionCriteria(f, false);
            ArrayList arrayList = this.b;
            arrayList.add(intersectionCriteria);
            arrayList.add(intersectionCriteria2);
            this.a.put(str, new adfy(atqdVar, new AtomicInteger(0), intersectionCriteria, intersectionCriteria2, j, new AtomicLong(-1L)));
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final Status criteriaMatched(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return Status.d;
        }
        for (adfy adfyVar : this.a.values()) {
            atqd atqdVar = adfyVar.a;
            aihf builder = atqdVar.toBuilder();
            atqg atqgVar = atqdVar.c;
            if (atqgVar == null) {
                atqgVar = atqg.a;
            }
            aihf builder2 = atqgVar.toBuilder();
            builder2.copyOnWrite();
            atqg atqgVar2 = (atqg) builder2.instance;
            atqgVar2.b &= -3;
            int i = 0;
            atqgVar2.d = 0;
            builder.copyOnWrite();
            atqd atqdVar2 = (atqd) builder.instance;
            atqg atqgVar3 = (atqg) builder2.build();
            atqgVar3.getClass();
            atqdVar2.c = atqgVar3;
            atqdVar2.b |= 1;
            atqd atqdVar3 = (atqd) builder.build();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                IntersectionCriteria intersectionCriteria = (IntersectionCriteria) arrayList.get(i2);
                if (Objects.equals(intersectionCriteria, adfyVar.c)) {
                    if (adfyVar.b.compareAndSet(i, 1)) {
                        this.c.x(this.f, atqdVar, this.g);
                        adfyVar.e.set(this.j.f().toEpochMilli());
                    }
                } else if (Objects.equals(intersectionCriteria, adfyVar.d) && adfyVar.b.getAndSet(i) == 1) {
                    long epochMilli = this.j.f().minusMillis(adfyVar.e.get()).toEpochMilli();
                    xgn xgnVar = this.c;
                    xgz xgzVar = this.f;
                    aihf aihfVarCreateBuilder = atqe.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    atqe atqeVar = (atqe) aihfVarCreateBuilder.instance;
                    atqdVar3.getClass();
                    atqeVar.c = atqdVar3;
                    atqeVar.b |= 1;
                    int i3 = (int) epochMilli;
                    aihfVarCreateBuilder.copyOnWrite();
                    atqe atqeVar2 = (atqe) aihfVarCreateBuilder.instance;
                    atqeVar2.b |= 2;
                    atqeVar2.d = i3;
                    xgnVar.q(xgzVar, (atqe) aihfVarCreateBuilder.build(), this.g);
                }
                i2++;
                i = 0;
            }
        }
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final ArrayList getCriteriaList() {
        return this.b;
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
