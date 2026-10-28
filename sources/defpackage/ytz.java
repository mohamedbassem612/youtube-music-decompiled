package defpackage;

import j$.util.Objects;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ytz extends yuf {
    private final agke a;

    public ytz(agke agkeVar) {
        agkeVar.getClass();
        this.a = agkeVar;
    }

    @Override // defpackage.yuf
    public final yty a(List list) {
        String str;
        list.getClass();
        agke agkeVar = this.a;
        int i = ((agpi) agkeVar).d;
        int i2 = ((agpi) list).d;
        if (i2 > i) {
            return new yty(true, agkeVar, null, "size." + i2 + '>' + i);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            zev zevVar = (zev) list.get(i3);
            yxk yxkVar = (yxk) agkeVar.get(i3);
            long j = yxkVar.b;
            long j2 = zevVar.a;
            if (j != j2) {
                str = "tp." + j + '.' + j2;
            } else {
                ywz ywzVar = yxkVar.a;
                ywy ywyVar = (ywy) ywzVar;
                yxi yxiVar = ywyVar.t;
                ywk ywkVar = zevVar.b;
                if (yxiVar != ywkVar.t) {
                    str = "mSvcRef";
                } else if (ywyVar.d != ywkVar.d) {
                    str = "mStrDRef";
                } else if (ywyVar.h.equals(ywkVar.h)) {
                    long j3 = ywyVar.e.a;
                    long j4 = ywkVar.e.a;
                    if (j3 != j4) {
                        str = "sPos." + j3 + '.' + j4;
                    } else {
                        long j5 = ywyVar.f;
                        long j6 = ywkVar.f;
                        if (j5 != j6) {
                            str = "mincp." + j5 + '.' + j6;
                        } else {
                            long j7 = ywyVar.g;
                            long j8 = ywkVar.g;
                            if (j7 != j8) {
                                str = "maxcp." + j7 + '.' + j8;
                            } else if (ywyVar.i != ywkVar.i) {
                                str = "pcRef.";
                            } else if (ywzVar.c() != ywkVar.l) {
                                str = "vol." + ywzVar.c() + '.' + ywkVar.l;
                            } else if (ywzVar.b() != ywkVar.m) {
                                str = "pbRate." + ywzVar.b() + '.' + ywkVar.m;
                            } else {
                                int i4 = ywyVar.n;
                                int i5 = ywkVar.n;
                                if (i4 != i5) {
                                    str = "flags." + i4 + '.' + i5;
                                } else if (!Objects.equals(ywzVar.q(), ywkVar.r)) {
                                    str = "vqr." + ywzVar.q() + '.' + ywkVar.r;
                                } else if (ywzVar.p() != ywkVar.s) {
                                    arfb arfbVarP = ywzVar.p();
                                    arfb arfbVar = ywkVar.s;
                                    String string = (arfbVarP == null ? "null" : Integer.valueOf(arfbVarP.e)).toString();
                                    str = "vqs." + string + '.' + (arfbVar != null ? Integer.valueOf(arfbVar.e) : "null").toString();
                                } else {
                                    str = null;
                                }
                            }
                        }
                    }
                } else {
                    str = "cpn." + ywyVar.h + '.' + ywkVar.h;
                }
            }
            if (str != null) {
                return new yty(true, agkeVar, Integer.valueOf(i3), str);
            }
        }
        agke agkeVarSubList = agkeVar.subList(i2, i);
        agkeVarSubList.getClass();
        return new yty(false, aguu.T(agkeVarSubList), null, null);
    }

    @Override // defpackage.yuf
    public final agke b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ytz) && awrc.c(this.a, ((ytz) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OptimisticAppendList(videosToQueue=" + this.a + ')';
    }
}
