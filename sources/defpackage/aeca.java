package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aeca extends aeck {
    private final int a;
    private final aecc b;
    private final Optional c;
    private final int d;

    public aeca(int i, aecc aeccVar, Optional optional, int i2) {
        this.a = i;
        this.b = aeccVar;
        this.c = optional;
        this.d = i2;
    }

    @Override // defpackage.aeck
    public final int a() {
        return this.d;
    }

    @Override // defpackage.aeck
    public final int b() {
        return this.a;
    }

    @Override // defpackage.aeck
    public final aecc c() {
        return this.b;
    }

    @Override // defpackage.aeck
    public final Optional d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeck) {
            aeck aeckVar = (aeck) obj;
            if (this.a == aeckVar.b() && this.b.equals(aeckVar.c()) && this.c.equals(aeckVar.d()) && this.d == aeckVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d;
    }

    public final String toString() {
        Optional optional = this.c;
        return "ResponsiveContainerResizedEvent{gridColumnCount=" + this.a + ", getContainerSpacingConfiguration=" + this.b.toString() + ", auxiliaryEventData=" + optional.toString() + ", contentHorizontalPaddingPx=" + this.d + '}';
    }
}
