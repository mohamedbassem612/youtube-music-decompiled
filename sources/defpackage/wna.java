package defpackage;

import app.rive.semantics.SemanticState;
import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wna implements wlx {
    private final /* synthetic */ int $cid;

    public wna(int i) {
        this.$cid = i;
    }

    @Override // defpackage.wlx
    public final /* synthetic */ MessageLite a(MessageLite messageLite) {
        int i = this.$cid;
        if (i == 0) {
            alyi alyiVar = (alyi) messageLite;
            return alyiVar.e == 9 ? (alqc) alyiVar.f : alqc.a;
        }
        if (i == 1) {
            alvt alvtVar = ((alqc) messageLite).e;
            return alvtVar == null ? alvt.a : alvtVar;
        }
        if (i != 2) {
            alyi alyiVar2 = (alyi) messageLite;
            return alyiVar2.e == 3 ? (amae) alyiVar2.f : amae.a;
        }
        alyi alyiVar3 = (alyi) messageLite;
        return alyiVar3.c == 2 ? (alvt) alyiVar3.d : alvt.a;
    }

    @Override // defpackage.wlx
    public final /* synthetic */ albe b(MessageLite messageLite) {
        int i = this.$cid;
        if (i == 0) {
            alyi alyiVar = (alyi) messageLite;
            albe albeVar = (alyiVar.e == 9 ? (alqc) alyiVar.f : alqc.a).j;
            return albeVar == null ? albe.a : albeVar;
        }
        if (i == 1) {
            alvt alvtVar = ((alqc) messageLite).e;
            if (alvtVar == null) {
                alvtVar = alvt.a;
            }
            albe albeVar2 = alvtVar.I;
            return albeVar2 == null ? albe.a : albeVar2;
        }
        if (i != 2) {
            alyi alyiVar2 = (alyi) messageLite;
            albe albeVar3 = (alyiVar2.e == 3 ? (amae) alyiVar2.f : amae.a).x;
            return albeVar3 == null ? albe.a : albeVar3;
        }
        alyi alyiVar3 = (alyi) messageLite;
        albe albeVar4 = (alyiVar3.c == 2 ? (alvt) alyiVar3.d : alvt.a).I;
        return albeVar4 == null ? albe.a : albeVar4;
    }

    @Override // defpackage.wlx
    public final /* synthetic */ alop c(MessageLite messageLite) {
        int i = this.$cid;
        if (i == 0) {
            alyi alyiVar = (alyi) messageLite;
            alop alopVar = (alyiVar.e == 9 ? (alqc) alyiVar.f : alqc.a).c;
            return alopVar == null ? alop.a : alopVar;
        }
        if (i == 1) {
            alvt alvtVar = ((alqc) messageLite).e;
            if (alvtVar == null) {
                alvtVar = alvt.a;
            }
            alop alopVar2 = alvtVar.d;
            return alopVar2 == null ? alop.a : alopVar2;
        }
        if (i != 2) {
            alyi alyiVar2 = (alyi) messageLite;
            alop alopVar3 = (alyiVar2.e == 3 ? (amae) alyiVar2.f : amae.a).d;
            return alopVar3 == null ? alop.a : alopVar3;
        }
        alyi alyiVar3 = (alyi) messageLite;
        alop alopVar4 = (alyiVar3.c == 2 ? (alvt) alyiVar3.d : alvt.a).d;
        return alopVar4 == null ? alop.a : alopVar4;
    }

    @Override // defpackage.wlx
    public final /* synthetic */ boolean d(MessageLite messageLite) {
        int i = this.$cid;
        if (i == 0) {
            alyi alyiVar = (alyi) messageLite;
            int i2 = alyiVar.e;
            if (i2 != 9) {
                return false;
            }
            if (((i2 == 9 ? (alqc) alyiVar.f : alqc.a).b & SemanticState.LiveRegion) == 0) {
                return false;
            }
        } else if (i == 1) {
            alqc alqcVar = (alqc) messageLite;
            if ((alqcVar.b & 4) == 0) {
                return false;
            }
            alvt alvtVar = alqcVar.e;
            if (alvtVar == null) {
                alvtVar = alvt.a;
            }
            if ((alvtVar.c & SemanticState.LiveRegion) == 0) {
                return false;
            }
        } else if (i != 2) {
            alyi alyiVar2 = (alyi) messageLite;
            if (((alyiVar2.e == 3 ? (amae) alyiVar2.f : amae.a).b & 134217728) == 0) {
                return false;
            }
        } else {
            alyi alyiVar3 = (alyi) messageLite;
            int i3 = alyiVar3.c;
            if (i3 != 2) {
                return false;
            }
            if (((i3 == 2 ? (alvt) alyiVar3.d : alvt.a).c & SemanticState.LiveRegion) == 0) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.wlx
    public final /* synthetic */ boolean e(MessageLite messageLite) {
        int i = this.$cid;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (((alyi) messageLite).e != 3) {
                        return false;
                    }
                } else if (((alyi) messageLite).c != 2) {
                    return false;
                }
            } else if ((((alqc) messageLite).b & 4) == 0) {
                return false;
            }
        } else if (((alyi) messageLite).e != 9) {
            return false;
        }
        return true;
    }
}
