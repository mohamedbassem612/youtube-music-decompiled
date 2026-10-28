package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adyq {
    public final anfy a;
    public final agkj b;
    public final boolean c;
    public final ajwo d;

    public adyq(anfy anfyVar, agkj agkjVar, boolean z, ajwo ajwoVar) {
        this.a = anfyVar;
        this.b = agkjVar;
        this.c = z;
        this.d = ajwoVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adyq) {
            adyq adyqVar = (adyq) obj;
            if (this.a.equals(adyqVar.a) && aguu.q(this.b, adyqVar.b) && this.c == adyqVar.c) {
                ajwo ajwoVar = this.d;
                if (ajwoVar == null) {
                    if (adyqVar.d == null) {
                        return true;
                    }
                } else if (ajwoVar.equals(adyqVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ (-721379959)) * 1000003) ^ this.b.hashCode();
        ajwo ajwoVar = this.d;
        return ((((iHashCode * (-721379959)) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (ajwoVar == null ? 0 : ajwoVar.hashCode())) * 1000003;
    }

    public final String toString() {
        ajwo ajwoVar = this.d;
        agkj agkjVar = this.b;
        return "ShowMenuBottomSheetArgs{navigationBarColorOverride=null, menuModel=" + String.valueOf(this.a) + ", endpointArgs=" + String.valueOf(agkjVar) + ", iconTintColorId=null, shouldResolveOfflineMenuItemAsync=" + this.c + ", menuEntryPointCommand=" + String.valueOf(ajwoVar) + ", entityStore=null}";
    }

    public adyq() {
        throw null;
    }
}
