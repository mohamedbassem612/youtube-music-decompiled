package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acmd implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aapl(16);
    public final List a;
    public final List b;

    public acmd(List list, List list2) {
        list.getClass();
        this.a = list;
        list2.getClass();
        this.b = list2;
        ahno.O(list.size() == list2.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ahno.O(aecm.aD((ajwo) it.next()));
        }
    }

    public final acmd a() {
        return new acmd(DesugarCollections.unmodifiableList(aguu.t(this.a)), DesugarCollections.unmodifiableList(aguu.t(this.b)));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[ReelToReelList size=");
        List<ajwo> list = this.a;
        sb.append(list.size());
        for (ajwo ajwoVar : list) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                apfp apfpVar = (apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                sb.append(" video[");
                sb.append(apfpVar.p);
                sb.append("]=");
                sb.append(apfpVar.o);
            } else {
                aihl aihlVar = apef.b;
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
                ajwoVar.c(aihlVarCheckIsLite3);
                if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar);
                    ajwoVar.c(aihlVarCheckIsLite4);
                    Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
                    apji apjiVar = ((apef) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2))).d;
                    if (apjiVar == null) {
                        apjiVar = apji.a;
                    }
                    aihl aihlVarCheckIsLite5 = aihn.checkIsLite(apei.a);
                    apjiVar.c(aihlVarCheckIsLite5);
                    Object objK3 = apjiVar.j.k(aihlVarCheckIsLite5.d);
                    apeh apehVar = (apeh) (objK3 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK3));
                    sb.append(" non-video content [screen_ve_type=");
                    apmn apmnVar = apehVar.c;
                    if (apmnVar == null) {
                        apmnVar = apmn.a;
                    }
                    sb.append(apmnVar.c);
                    sb.append(", id=");
                    sb.append(apehVar.e);
                    sb.append(']');
                }
            }
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        acli[] acliVarArr = new acli[list.size()];
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            acliVarArr[i2] = new acli((ajwo) it.next());
            i2++;
        }
        parcel.writeParcelableArray(acliVarArr, 0);
        for (Optional optional : this.b) {
            if (optional.isPresent()) {
                parcel.writeByteArray(((aigj) optional.get()).G());
            } else {
                parcel.writeByteArray(new byte[0]);
            }
        }
    }

    public acmd(ajwo ajwoVar) {
        ajwoVar.getClass();
        ahno.O(aecm.aD(ajwoVar));
        this.a = DesugarCollections.unmodifiableList(aguu.s(ajwoVar));
        this.b = DesugarCollections.unmodifiableList(aguu.s(Optional.empty()));
    }
}
