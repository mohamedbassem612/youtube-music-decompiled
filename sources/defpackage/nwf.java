package defpackage;

import android.util.SparseArray;
import android.view.MotionEvent;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nwf {
    public final nxg a;
    public final Object b;
    public final SenderStateOuterClass$SenderState c;
    public final ntq d;
    public final ntx e;
    public final nsl f;
    public final agfr g;
    private final agkj h;
    private final MotionEvent i;
    private final SparseArray j;
    private final int k;
    private final int l;
    private final int m;

    public nwf(int i, nxg nxgVar, Object obj, agkj agkjVar, SenderStateOuterClass$SenderState senderStateOuterClass$SenderState, ntq ntqVar, ntx ntxVar, nsl nslVar, MotionEvent motionEvent, agfr agfrVar, SparseArray sparseArray, int i2, int i3) {
        this.m = i;
        this.a = nxgVar;
        this.b = obj;
        this.h = agkjVar;
        this.c = senderStateOuterClass$SenderState;
        this.d = ntqVar;
        this.e = ntxVar;
        this.f = nslVar;
        this.i = motionEvent;
        this.g = agfrVar;
        this.j = sparseArray;
        this.k = i2;
        this.l = i3;
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
        if (obj instanceof nwf) {
            nwf nwfVar = (nwf) obj;
            int i = this.m;
            if (i != 0 ? i == nwfVar.m : nwfVar.m == 0) {
                nxg nxgVar = this.a;
                if (nxgVar != null ? nxgVar.equals(nwfVar.a) : nwfVar.a == null) {
                    Object obj2 = this.b;
                    if (obj2 != null ? obj2.equals(nwfVar.b) : nwfVar.b == null) {
                        if (aguu.q(this.h, nwfVar.h) && ((senderStateOuterClass$SenderState = this.c) != null ? senderStateOuterClass$SenderState.equals(nwfVar.c) : nwfVar.c == null) && ((ntqVar = this.d) != null ? ntqVar.equals(nwfVar.d) : nwfVar.d == null) && ((ntxVar = this.e) != null ? ntxVar.equals(nwfVar.e) : nwfVar.e == null) && this.f.equals(nwfVar.f) && ((motionEvent = this.i) != null ? motionEvent.equals(nwfVar.i) : nwfVar.i == null) && ((agfrVar = this.g) != null ? agfrVar.equals(nwfVar.g) : nwfVar.g == null) && ((sparseArray = this.j) != null ? sparseArray.equals(nwfVar.j) : nwfVar.j == null) && this.k == nwfVar.k && this.l == nwfVar.l) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.m;
        if (i == 0) {
            i = 0;
        }
        nxg nxgVar = this.a;
        int iHashCode = (((i ^ 1000003) * 1000003) ^ (nxgVar == null ? 0 : nxgVar.hashCode())) * 1000003;
        Object obj = this.b;
        int iHashCode2 = (((iHashCode ^ (obj == null ? 0 : obj.hashCode())) * 1000003) ^ this.h.hashCode()) * 1000003;
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = this.c;
        int iHashCode3 = (iHashCode2 ^ (senderStateOuterClass$SenderState == null ? 0 : senderStateOuterClass$SenderState.hashCode())) * 1000003;
        ntq ntqVar = this.d;
        int iHashCode4 = iHashCode3 ^ (ntqVar == null ? 0 : ntqVar.hashCode());
        ntx ntxVar = this.e;
        int iHashCode5 = ((((iHashCode4 * (-721379959)) ^ (ntxVar == null ? 0 : ntxVar.hashCode())) * 1000003) ^ this.f.hashCode()) * 1000003;
        MotionEvent motionEvent = this.i;
        int iHashCode6 = (iHashCode5 ^ (motionEvent == null ? 0 : motionEvent.hashCode())) * 1000003;
        agfr agfrVar = this.g;
        int iHashCode7 = (iHashCode6 ^ (agfrVar == null ? 0 : agfrVar.hashCode())) * 1000003;
        SparseArray sparseArray = this.j;
        return ((((iHashCode7 ^ (sparseArray != null ? sparseArray.hashCode() : 0)) * 1000003) ^ this.k) * 1000003) ^ this.l;
    }

    public final String toString() {
        SparseArray sparseArray = this.j;
        agfr agfrVar = this.g;
        MotionEvent motionEvent = this.i;
        nsl nslVar = this.f;
        ntx ntxVar = this.e;
        ntq ntqVar = this.d;
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = this.c;
        agkj agkjVar = this.h;
        Object obj = this.b;
        return "SafeCommandEventData{eventType=" + nqz.a(this.m) + ", touchLocation=" + String.valueOf(this.a) + ", customData=" + String.valueOf(obj) + ", customMap=" + String.valueOf(agkjVar) + ", senderState=" + String.valueOf(senderStateOuterClass$SenderState) + ", elementBuilder=" + String.valueOf(ntqVar) + ", identifier=null, elementsConfig=" + String.valueOf(ntxVar) + ", conversionContext=" + String.valueOf(nslVar) + ", motionEvent=" + String.valueOf(motionEvent) + ", renderNextInteractionLogger=" + String.valueOf(agfrVar) + ", nodeDataMap=" + String.valueOf(sparseArray) + ", viewKey=" + this.k + ", nodeId=" + this.l + '}';
    }

    public nwf() {
        throw null;
    }
}
