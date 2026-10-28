package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adyt {
    public final Context a;
    public final aduv b;
    public final boolean c;
    public final boolean d;
    public final aunn e;
    public final xgn f;
    public final anfv g;
    public final avgj h;

    public adyt(Context context, aduv aduvVar, boolean z, boolean z2, aunn aunnVar, xgn xgnVar, anfv anfvVar, avgj avgjVar) {
        this.a = context;
        this.b = aduvVar;
        this.c = z;
        this.d = z2;
        this.e = aunnVar;
        this.f = xgnVar;
        this.g = anfvVar;
        this.h = avgjVar;
    }

    public final boolean equals(Object obj) {
        aduv aduvVar;
        aunn aunnVar;
        xgn xgnVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof adyt) {
            adyt adytVar = (adyt) obj;
            if (this.a.equals(adytVar.a) && ((aduvVar = this.b) != null ? aduvVar.equals(adytVar.b) : adytVar.b == null) && this.c == adytVar.c && this.d == adytVar.d && ((aunnVar = this.e) != null ? aunnVar.equals(adytVar.e) : adytVar.e == null) && ((xgnVar = this.f) != null ? xgnVar.equals(adytVar.f) : adytVar.f == null) && this.g.equals(adytVar.g) && this.h.equals(adytVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        aduv aduvVar = this.b;
        int iHashCode2 = ((((((iHashCode * 1000003) ^ (aduvVar == null ? 0 : aduvVar.hashCode())) * (-721379959)) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true == this.d ? 1231 : 1237)) * (-721379959);
        aunn aunnVar = this.e;
        int iHashCode3 = (iHashCode2 ^ (aunnVar == null ? 0 : aunnVar.hashCode())) * 1000003;
        xgn xgnVar = this.f;
        return ((((iHashCode3 ^ (xgnVar != null ? xgnVar.hashCode() : 0)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        avgj avgjVar = this.h;
        anfv anfvVar = this.g;
        xgn xgnVar = this.f;
        aunn aunnVar = this.e;
        aduv aduvVar = this.b;
        return "MenuItemCreationParams{context=" + String.valueOf(this.a) + ", iconResolver=" + String.valueOf(aduvVar) + ", iconTintColorId=null, shouldUseMultiLineBottomsheetItems=" + this.c + ", shouldApplyBuenosAiresStyle=" + this.d + ", entityStore=null, elementsTransformer=" + String.valueOf(aunnVar) + ", interactionLogger=" + String.valueOf(xgnVar) + ", menuItem=" + String.valueOf(anfvVar) + ", onItemClick=" + String.valueOf(avgjVar) + '}';
    }

    public adyt() {
        throw null;
    }
}
