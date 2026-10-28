package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sku implements skp, sms {
    public final String a;
    public final String b;
    private final String c;
    private final aixr d;

    public sku(String str, aixr aixrVar, String str2, String str3) {
        this.c = str;
        this.d = aixrVar;
        if (str2 == null) {
            throw new NullPointerException("Null getAssociatedLayoutId");
        }
        this.a = str2;
        if (str3 == null) {
            throw new NullPointerException("Null getAssociatedSlotId");
        }
        this.b = str3;
    }

    @Override // defpackage.snk
    public final aixr a() {
        return this.d;
    }

    @Override // defpackage.snk
    public final String b() {
        return this.c;
    }

    @Override // defpackage.skp
    public final String c() {
        return this.a;
    }

    @Override // defpackage.snk
    public final boolean d() {
        return false;
    }

    @Override // defpackage.sms
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sku) {
            sku skuVar = (sku) obj;
            if (this.c.equals(skuVar.c) && this.d.equals(skuVar.d) && this.a.equals(skuVar.a) && this.b.equals(skuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "LayoutIdEnteredAndSlotFilledTrigger{getTriggerId=" + this.c + ", getTriggerType=" + this.d.toString() + ", shouldOnlyTriggerOnce=false, getAssociatedLayoutId=" + this.a + ", getAssociatedSlotId=" + this.b + '}';
    }

    public sku() {
        throw null;
    }
}
