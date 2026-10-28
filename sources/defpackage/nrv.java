package defpackage;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nrv {
    public final WeakReference a;
    public final View b;
    public final nxg c;
    public final Object d;
    public final agkj e;
    public final SenderStateOuterClass$SenderState f;
    public final ntq g;
    public final ntx h;
    public final nsl i;
    public final MotionEvent j;
    public final agfr k;
    public final SparseArray l;
    public final int m;
    public final int n;
    public final int o;

    public nrv(WeakReference weakReference, View view, int i, nxg nxgVar, Object obj, agkj agkjVar, SenderStateOuterClass$SenderState senderStateOuterClass$SenderState, ntq ntqVar, ntx ntxVar, nsl nslVar, MotionEvent motionEvent, agfr agfrVar, SparseArray sparseArray, int i2, int i3) {
        this.a = weakReference;
        this.b = view;
        this.o = i;
        this.c = nxgVar;
        this.d = obj;
        this.e = agkjVar;
        this.f = senderStateOuterClass$SenderState;
        this.g = ntqVar;
        this.h = ntxVar;
        this.i = nslVar;
        this.j = motionEvent;
        this.k = agfrVar;
        this.l = sparseArray;
        this.m = i2;
        this.n = i3;
    }

    public static nrt d() {
        nrt nrtVar = new nrt();
        nrtVar.b(nsl.a);
        nrtVar.e(-1);
        nrtVar.c(-1);
        return nrtVar;
    }

    public final View a() {
        View view = this.b;
        return view == null ? b() : view;
    }

    public final View b() {
        WeakReference weakReference = this.a;
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    public final View c() {
        View viewB = b();
        return viewB == null ? this.b : viewB;
    }

    public final nrt e() {
        nrt nrtVar = new nrt(this);
        nrtVar.a.i(this.e);
        return nrtVar;
    }

    public final boolean equals(Object obj) {
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState;
        ntq ntqVar;
        ntx ntxVar;
        MotionEvent motionEvent;
        agfr agfrVar;
        SparseArray sparseArray;
        if (obj == this) {
            return true;
        }
        if (obj instanceof nrv) {
            nrv nrvVar = (nrv) obj;
            WeakReference weakReference = this.a;
            if (weakReference != null ? weakReference.equals(nrvVar.a) : nrvVar.a == null) {
                View view = this.b;
                if (view != null ? view.equals(nrvVar.b) : nrvVar.b == null) {
                    int i = this.o;
                    if (i != 0 ? i == nrvVar.o : nrvVar.o == 0) {
                        nxg nxgVar = this.c;
                        if (nxgVar != null ? nxgVar.equals(nrvVar.c) : nrvVar.c == null) {
                            Object obj2 = this.d;
                            if (obj2 != null ? obj2.equals(nrvVar.d) : nrvVar.d == null) {
                                if (aguu.q(this.e, nrvVar.e) && ((senderStateOuterClass$SenderState = this.f) != null ? senderStateOuterClass$SenderState.equals(nrvVar.f) : nrvVar.f == null) && ((ntqVar = this.g) != null ? ntqVar.equals(nrvVar.g) : nrvVar.g == null) && ((ntxVar = this.h) != null ? ntxVar.equals(nrvVar.h) : nrvVar.h == null) && this.i.equals(nrvVar.i) && ((motionEvent = this.j) != null ? motionEvent.equals(nrvVar.j) : nrvVar.j == null) && ((agfrVar = this.k) != null ? agfrVar.equals(nrvVar.k) : nrvVar.k == null) && ((sparseArray = this.l) != null ? sparseArray.equals(nrvVar.l) : nrvVar.l == null) && this.m == nrvVar.m && this.n == nrvVar.n) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final nwf f() {
        agkj agkjVar;
        nsl nslVar;
        nwe nweVar = new nwe();
        nweVar.a(nsl.a);
        nweVar.c(-1);
        nweVar.b(-1);
        nweVar.n = this.o;
        nweVar.a = this.c;
        nweVar.b = this.d;
        agkj agkjVar2 = this.e;
        if (agkjVar2 == null) {
            throw new NullPointerException("Null customMap");
        }
        nweVar.c = agkjVar2;
        nweVar.d = this.f;
        nweVar.e = this.g;
        nweVar.f = this.h;
        nweVar.a(this.i);
        nweVar.h = this.j;
        nweVar.i = this.k;
        nweVar.j = this.l;
        nweVar.c(this.m);
        nweVar.b(this.n);
        if (nweVar.m == 3 && (agkjVar = nweVar.c) != null && (nslVar = nweVar.g) != null) {
            return new nwf(nweVar.n, nweVar.a, nweVar.b, agkjVar, nweVar.d, nweVar.e, nweVar.f, nslVar, nweVar.h, nweVar.i, nweVar.j, nweVar.k, nweVar.l);
        }
        StringBuilder sb = new StringBuilder();
        if (nweVar.c == null) {
            sb.append(" customMap");
        }
        if (nweVar.g == null) {
            sb.append(" conversionContext");
        }
        if ((nweVar.m & 1) == 0) {
            sb.append(" viewKey");
        }
        if ((nweVar.m & 2) == 0) {
            sb.append(" nodeId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final int hashCode() {
        WeakReference weakReference = this.a;
        int iHashCode = weakReference == null ? 0 : weakReference.hashCode();
        View view = this.b;
        int iHashCode2 = (((iHashCode ^ 1000003) * 1000003) ^ (view == null ? 0 : view.hashCode())) * 1000003;
        int i = this.o;
        if (i == 0) {
            i = 0;
        }
        int i2 = (iHashCode2 ^ i) * 1000003;
        nxg nxgVar = this.c;
        int iHashCode3 = (i2 ^ (nxgVar == null ? 0 : nxgVar.hashCode())) * 1000003;
        Object obj = this.d;
        int iHashCode4 = (((iHashCode3 ^ (obj == null ? 0 : obj.hashCode())) * 1000003) ^ this.e.hashCode()) * 1000003;
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = this.f;
        int iHashCode5 = (iHashCode4 ^ (senderStateOuterClass$SenderState == null ? 0 : senderStateOuterClass$SenderState.hashCode())) * 1000003;
        ntq ntqVar = this.g;
        int iHashCode6 = iHashCode5 ^ (ntqVar == null ? 0 : ntqVar.hashCode());
        ntx ntxVar = this.h;
        int iHashCode7 = ((((iHashCode6 * (-721379959)) ^ (ntxVar == null ? 0 : ntxVar.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003;
        MotionEvent motionEvent = this.j;
        int iHashCode8 = (iHashCode7 ^ (motionEvent == null ? 0 : motionEvent.hashCode())) * 1000003;
        agfr agfrVar = this.k;
        int iHashCode9 = (iHashCode8 ^ (agfrVar == null ? 0 : agfrVar.hashCode())) * 1000003;
        SparseArray sparseArray = this.l;
        return ((((iHashCode9 ^ (sparseArray != null ? sparseArray.hashCode() : 0)) * 1000003) ^ this.m) * 1000003) ^ this.n;
    }

    public final String toString() {
        SparseArray sparseArray = this.l;
        agfr agfrVar = this.k;
        MotionEvent motionEvent = this.j;
        nsl nslVar = this.i;
        ntx ntxVar = this.h;
        ntq ntqVar = this.g;
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = this.f;
        agkj agkjVar = this.e;
        Object obj = this.d;
        nxg nxgVar = this.c;
        View view = this.b;
        return "CommandEventData{viewWeakRef=" + String.valueOf(this.a) + ", anchorView=" + String.valueOf(view) + ", eventType=" + nqz.a(this.o) + ", touchLocation=" + String.valueOf(nxgVar) + ", customData=" + String.valueOf(obj) + ", customMap=" + String.valueOf(agkjVar) + ", senderState=" + String.valueOf(senderStateOuterClass$SenderState) + ", elementBuilder=" + String.valueOf(ntqVar) + ", identifier=null, elementsConfig=" + String.valueOf(ntxVar) + ", conversionContext=" + String.valueOf(nslVar) + ", motionEvent=" + String.valueOf(motionEvent) + ", renderNextInteractionLogger=" + String.valueOf(agfrVar) + ", nodeDataMap=" + String.valueOf(sparseArray) + ", viewKey=" + this.m + ", nodeId=" + this.n + '}';
    }

    public nrv() {
        throw null;
    }
}
