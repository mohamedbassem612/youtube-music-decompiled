package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xbl implements adky {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public xbl(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    private final void b() {
        xbn xbnVar = (xbn) this.a;
        if (xbnVar.k) {
            return;
        }
        xbnVar.v(10000L);
    }

    private final boolean f(int i) {
        xbn xbnVar = (xbn) this.a;
        if (xbnVar.j() || !(xbnVar.h() || i == 0)) {
            return false;
        }
        xbnVar.v(500L);
        return true;
    }

    private final void g() {
        xby xbyVar = (xby) this.a;
        if (xbyVar.d) {
            return;
        }
        xbyVar.a(10000L);
    }

    private final boolean h(int i) {
        xby xbyVar = (xby) this.a;
        if (xbyVar.h() || !(xbyVar.g() || i == 0)) {
            return false;
        }
        xbyVar.a(500L);
        return true;
    }

    @Override // defpackage.tbj
    public final void d(int i, int i2) {
        int i3 = this.$cid;
        if (i3 == 0) {
            if (f(i)) {
                return;
            }
            b();
            return;
        }
        if (i3 == 1) {
            ((ikf) this.a).d();
            return;
        }
        if (i3 == 2) {
            if (h(i)) {
                return;
            }
            g();
            return;
        }
        if (i3 != 3) {
            Object obj = this.a;
            if (i3 != 4) {
                ((adyg) obj).notifyDataSetChanged();
                return;
            } else {
                ((adld) obj).d.K(i, i2);
                return;
            }
        }
        Object obj2 = this.a;
        adku adkuVar = (adku) obj2;
        int i4 = adkuVar.b;
        if (i < i4) {
            int iMin = Math.min(i + i2, i4) - i;
            int i5 = adkuVar.b;
            int iA = adkuVar.a.a() - i2;
            adkuVar.b = Math.max(i5, iA + iMin);
            adks adksVar = (adks) obj2;
            adksVar.z(i, iMin);
            adkuVar.b = i5;
            int iMin2 = Math.min(iA, i5) + iMin;
            int i6 = adkuVar.b;
            if (iMin2 > i6) {
                adksVar.A(i6, iMin2 - i6);
            }
        }
    }

    @Override // defpackage.adky
    public final void jS() {
        int i = this.$cid;
        if (i == 0) {
            b();
            return;
        }
        if (i == 1) {
            ((ikf) this.a).d();
            return;
        }
        if (i == 2) {
            g();
            return;
        }
        if (i == 3) {
            ((adks) this.a).w();
            return;
        }
        Object obj = this.a;
        if (i != 4) {
            ((adyg) obj).notifyDataSetChanged();
        } else {
            ((adld) obj).d.O();
        }
    }

    @Override // defpackage.tbj
    public final void jT(int i, int i2) {
        int i3 = this.$cid;
        if (i3 == 0) {
            if (f(i)) {
                return;
            }
            b();
            return;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                if (h(i)) {
                    return;
                }
                g();
            } else {
                if (i3 != 3) {
                    Object obj = this.a;
                    if (i3 != 4) {
                        ((adyg) obj).notifyDataSetChanged();
                        return;
                    } else {
                        ((adld) obj).d.J(i, i2);
                        return;
                    }
                }
                Object obj2 = this.a;
                int i4 = ((adku) obj2).b;
                if (i < i4) {
                    ((adks) obj2).y(i, Math.min(i2 + i, i4) - i);
                }
            }
        }
    }

    @Override // defpackage.tbj
    public final void jU(int i, int i2) {
        int i3 = this.$cid;
        if (i3 == 0) {
            b();
            return;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                g();
                return;
            }
            if (i3 != 3) {
                Object obj = this.a;
                if (i3 != 4) {
                    ((adyg) obj).notifyDataSetChanged();
                    return;
                } else {
                    ((adld) obj).d.L(i, i2);
                    return;
                }
            }
            Object obj2 = this.a;
            adku adkuVar = (adku) obj2;
            int i4 = adkuVar.b;
            if (i < i4) {
                int iMin = Math.min(i2 + i, i4) - i;
                int i5 = adkuVar.b;
                int iA = adkuVar.a.a();
                if (i5 < iA + iMin) {
                    adkuVar.b -= iMin;
                }
                adks adksVar = (adks) obj2;
                adksVar.A(i, iMin);
                adkuVar.b = i5;
                int i6 = i5 - iMin;
                if (iA > i6) {
                    adksVar.z(i6, Math.min(iA, i5) - i6);
                }
            }
        }
    }

    @Override // defpackage.tbj
    public final void k(int i, int i2) {
        int i3 = this.$cid;
        if (i3 == 0) {
            b();
            return;
        }
        boolean z = true;
        if (i3 != 1) {
            if (i3 == 2) {
                g();
                return;
            }
            if (i3 != 3) {
                Object obj = this.a;
                if (i3 != 4) {
                    ((adyg) obj).notifyDataSetChanged();
                    return;
                } else {
                    ((adld) obj).d.P(i, i2);
                    return;
                }
            }
            Object obj2 = this.a;
            int i4 = ((adku) obj2).b;
            boolean z2 = i2 < i4;
            boolean z3 = i < i4;
            if (z3) {
                z = z2;
            } else if (!z2) {
                return;
            }
            if (!z3 || !z || i + 1 > i4 || i2 + 1 > i4) {
                ((adks) obj2).w();
            } else {
                ((adks) obj2).C(i, i2);
            }
        }
    }
}
