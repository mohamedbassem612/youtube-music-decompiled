package defpackage;

import android.os.Bundle;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class pff implements qbh {
    public pve a;
    public Map b;
    public awou c;

    static {
        agsn.h("GnpSdk");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x012c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0139  */
    /* JADX WARN: Code duplicated, block: B:46:0x013f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0143  */
    /* JADX WARN: Code duplicated, block: B:50:0x0147  */
    /* JADX WARN: Code duplicated, block: B:51:0x014a  */
    /* JADX WARN: Code duplicated, block: B:53:0x014e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0168  */
    /* JADX WARN: Code duplicated, block: B:66:0x016b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0171  */
    /* JADX WARN: Code duplicated, block: B:70:0x0177  */
    /* JADX WARN: Code duplicated, block: B:71:0x017d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0191  */
    /* JADX WARN: Code duplicated, block: B:75:0x0196  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    public static /* synthetic */ Object i(pff pffVar, Bundle bundle, awoq awoqVar) throws Throwable {
        pfe pfeVar;
        int i;
        awrm awrmVar;
        awrm awrmVar2;
        Object obj;
        Bundle bundle2;
        awrm awrmVar3;
        pff pffVar2;
        awrm awrmVar4;
        pdq pdqVar;
        MessageLite messageLite;
        Throwable th;
        pky pkvVar;
        pkx pkxVar;
        per perVar;
        MessageLite messageLite2;
        Object obj2;
        pky pkyVar;
        MessageLite messageLite3;
        plx plxVar;
        if (awoqVar instanceof pfe) {
            pfeVar = (pfe) awoqVar;
            int i2 = pfeVar.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pfeVar.i = i2 - Integer.MIN_VALUE;
            } else {
                pfeVar = new pfe(pffVar, awoqVar);
            }
        } else {
            pfeVar = new pfe(pffVar, awoqVar);
        }
        Object objG = pfeVar.g;
        awox awoxVar = awox.a;
        int i3 = pfeVar.i;
        if (i3 == 0) {
            atqp.j(objG);
            i = bundle.getInt("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_RETRY_COUNT");
            awrmVar = new awrm();
            bundle.getClass();
            agev agevVarH = agev.h(nvi.a(bundle));
            if (agevVarH.g()) {
                pve pveVar = pffVar.a;
                if (pveVar == null) {
                    awrc.b("gnpAccountStorage");
                    pveVar = null;
                }
                pxk pxkVar = (pxk) agevVarH.c();
                pfeVar.a = pffVar;
                pfeVar.b = bundle;
                pfeVar.c = awrmVar;
                pfeVar.d = awrmVar;
                pfeVar.f = i;
                pfeVar.i = 1;
                Object objB = pveVar.b(pxkVar, pfeVar);
                if (objB == awoxVar) {
                    return awoxVar;
                }
                awrmVar2 = awrmVar;
                obj = objB;
                bundle2 = bundle;
                awrmVar3 = awrmVar2;
            }
            aihf aihfVarCreateBuilder = aieu.a.createBuilder();
            aihfVarCreateBuilder.getClass();
            aihfVarCreateBuilder.copyOnWrite();
            aieu aieuVar = (aieu) aihfVarCreateBuilder.instance;
            aieuVar.b |= 1;
            aieuVar.c = i;
            aihn aihnVarBuild = aihfVarCreateBuilder.build();
            aihnVarBuild.getClass();
            plx plxVar2 = (plx) awrmVar.a;
            pfeVar.a = pffVar;
            pfeVar.b = awrmVar;
            pfeVar.c = null;
            pfeVar.d = null;
            pfeVar.i = 2;
            objG = pffVar.g(bundle, (aieu) aihnVarBuild, plxVar2, pfeVar);
            if (objG != awoxVar) {
                return awoxVar;
            }
            pffVar2 = pffVar;
            awrmVar4 = awrmVar;
            pdqVar = (pdq) objG;
            MessageLite messageLite4 = pdqVar.a;
            pdqVar.getClass();
            messageLite = pdqVar.b;
            if (messageLite != null) {
                pkvVar = new pla(messageLite);
            } else {
                th = pdqVar.c;
                if (th != null) {
                    if (th instanceof pqh) {
                        pkxVar = pkx.g;
                    } else if (th instanceof SocketException) {
                        pkxVar = pkx.az;
                    } else {
                        pkxVar = pkx.az;
                    }
                    if (pdqVar.d) {
                        pkvVar = new pkw(th, pkxVar);
                    } else {
                        pkvVar = new pkv(th, pkxVar);
                    }
                } else {
                    pkvVar = new pkv(new IllegalStateException("ChimeRpc doesn't have a response nor error."), pkx.aP);
                }
            }
            if (pkvVar.j()) {
                return qnl.ax(pkvVar);
            }
            if (pffVar2.h().length() > 0) {
            }
            pffVar2.h();
            pkyVar = pkvVar;
            return qnl.ax(pkyVar);
        }
        if (i3 == 1) {
            int i4 = pfeVar.f;
            awrmVar3 = (awrm) pfeVar.d;
            awrm awrmVar5 = (awrm) pfeVar.c;
            bundle2 = (Bundle) pfeVar.b;
            pff pffVar3 = (pff) pfeVar.a;
            atqp.j(objG);
            i = i4;
            pffVar = pffVar3;
            awrmVar2 = awrmVar5;
            obj = objG;
        } else if (i3 == 2) {
            awrm awrmVar6 = (awrm) pfeVar.b;
            pffVar2 = (pff) pfeVar.a;
            atqp.j(objG);
            awrmVar4 = awrmVar6;
            pdqVar = (pdq) objG;
            MessageLite messageLite5 = pdqVar.a;
            pdqVar.getClass();
            messageLite = pdqVar.b;
            if (messageLite != null) {
                pkvVar = new pla(messageLite);
            } else {
                th = pdqVar.c;
                if (th != null) {
                    if (th instanceof pqh) {
                        pkxVar = pkx.g;
                    } else if ((th instanceof SocketException) || (th instanceof UnknownHostException) || (th instanceof IOException)) {
                        pkxVar = pkx.az;
                    } else if (!(th instanceof pnr)) {
                        pkxVar = pkx.aP;
                    } else if (pdqVar.e) {
                        pkxVar = pkx.av;
                    } else if (pdqVar.e) {
                        pkxVar = pkx.aP;
                    } else {
                        pkxVar = pkx.aw;
                    }
                    if (pdqVar.d) {
                        pkvVar = new pkw(th, pkxVar);
                    } else {
                        pkvVar = new pkv(th, pkxVar);
                    }
                } else {
                    pkvVar = new pkv(new IllegalStateException("ChimeRpc doesn't have a response nor error."), pkx.aP);
                }
            }
            if (pkvVar.j()) {
                return qnl.ax(pkvVar);
            }
            if (pffVar2.h().length() > 0 || !pffVar2.j().containsKey(pffVar2.h())) {
                pffVar2.h();
            } else {
                pffVar2.h();
                perVar = (per) atqq.x(pffVar2.j(), pffVar2.h());
                if (pkvVar instanceof pku) {
                    plx plxVar3 = (plx) awrmVar4.a;
                    pfeVar.a = awrmVar4;
                    pfeVar.b = messageLite5;
                    pfeVar.c = pkvVar;
                    pfeVar.d = perVar;
                    pfeVar.e = pkvVar;
                    pfeVar.i = 3;
                    if (perVar.b(plxVar3, messageLite5, pfeVar) == awoxVar) {
                        return awoxVar;
                    }
                }
                messageLite2 = messageLite5;
                obj2 = pkvVar;
                if (obj2 instanceof pla) {
                    messageLite3 = (MessageLite) ((pla) obj2).a;
                    plxVar = (plx) awrmVar4.a;
                    pfeVar.a = pkvVar;
                    pfeVar.b = obj2;
                    pfeVar.c = null;
                    pfeVar.d = null;
                    pfeVar.e = null;
                    pfeVar.i = 4;
                    if (perVar.a(plxVar, messageLite2, messageLite3, pfeVar) == awoxVar) {
                        return awoxVar;
                    }
                }
            }
            pkyVar = pkvVar;
        } else if (i3 == 3) {
            obj2 = pfeVar.e;
            perVar = (per) pfeVar.d;
            pky pkyVar2 = (pky) pfeVar.c;
            messageLite2 = (MessageLite) pfeVar.b;
            awrmVar4 = (awrm) pfeVar.a;
            atqp.j(objG);
            pkvVar = pkyVar2;
            if (obj2 instanceof pla) {
                messageLite3 = (MessageLite) ((pla) obj2).a;
                plxVar = (plx) awrmVar4.a;
                pfeVar.a = pkvVar;
                pfeVar.b = obj2;
                pfeVar.c = null;
                pfeVar.d = null;
                pfeVar.e = null;
                pfeVar.i = 4;
                if (perVar.a(plxVar, messageLite2, messageLite3, pfeVar) == awoxVar) {
                    return awoxVar;
                }
            }
            pkyVar = pkvVar;
        } else {
            if (i3 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pkyVar = (pky) pfeVar.a;
            atqp.j(objG);
        }
        return qnl.ax(pkyVar);
        pky pkyVar3 = (pky) obj;
        int iAu = a.au(pkyVar3);
        if (iAu != 0) {
            if (iAu == 1) {
                return (pku) pkyVar3;
            }
            throw new awmj();
        }
        awrmVar3.a = ((pla) pkyVar3).a;
        if (awrmVar2.a == null) {
            return new pkv(new plu("Account is not in storage"), pkx.X);
        }
        bundle = bundle2;
        awrmVar = awrmVar2;
        aihf aihfVarCreateBuilder2 = aieu.a.createBuilder();
        aihfVarCreateBuilder2.getClass();
        aihfVarCreateBuilder2.copyOnWrite();
        aieu aieuVar2 = (aieu) aihfVarCreateBuilder2.instance;
        aieuVar2.b |= 1;
        aieuVar2.c = i;
        aihn aihnVarBuild2 = aihfVarCreateBuilder2.build();
        aihnVarBuild2.getClass();
        plx plxVar4 = (plx) awrmVar.a;
        pfeVar.a = pffVar;
        pfeVar.b = awrmVar;
        pfeVar.c = null;
        pfeVar.d = null;
        pfeVar.i = 2;
        objG = pffVar.g(bundle, (aieu) aihnVarBuild2, plxVar4, pfeVar);
        if (objG != awoxVar) {
            return awoxVar;
        }
        pffVar2 = pffVar;
        awrmVar4 = awrmVar;
        pdqVar = (pdq) objG;
        MessageLite messageLite6 = pdqVar.a;
        pdqVar.getClass();
        messageLite = pdqVar.b;
        if (messageLite != null) {
            pkvVar = new pla(messageLite);
        } else {
            th = pdqVar.c;
            if (th != null) {
                if (th instanceof pqh) {
                    pkxVar = pkx.g;
                } else if (th instanceof SocketException) {
                    pkxVar = pkx.az;
                } else {
                    pkxVar = pkx.az;
                }
                if (pdqVar.d) {
                    pkvVar = new pkw(th, pkxVar);
                } else {
                    pkvVar = new pkv(th, pkxVar);
                }
            } else {
                pkvVar = new pkv(new IllegalStateException("ChimeRpc doesn't have a response nor error."), pkx.aP);
            }
        }
        if (pkvVar.j()) {
            return qnl.ax(pkvVar);
        }
        if (pffVar2.h().length() > 0) {
        }
        pffVar2.h();
        pkyVar = pkvVar;
        return qnl.ax(pkyVar);
    }

    protected static final pdq k() {
        qat qatVarC = pdq.c();
        qatVarC.b = new IllegalStateException("chimeAccount should not be null.");
        qatVarC.f(false);
        return qatVarC.d();
    }

    @Override // defpackage.qbh
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // defpackage.qbh
    public final pky b(Bundle bundle) {
        awou awouVar = this.c;
        if (awouVar == null) {
            awrc.b("blockingContext");
            awouVar = null;
        }
        return (pky) awqx.l(awouVar, new gmc(this, bundle, (awoq) null, 17));
    }

    @Override // defpackage.qbh
    public final Object c(Bundle bundle, awoq awoqVar) {
        return i(this, bundle, awoqVar);
    }

    @Override // defpackage.qbh
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // defpackage.qbh
    public final /* synthetic */ int f() {
        return 3;
    }

    public abstract Object g(Bundle bundle, aieu aieuVar, plx plxVar, awoq awoqVar);

    protected abstract String h();

    public final Map j() {
        Map map = this.b;
        if (map != null) {
            return map;
        }
        awrc.b("callbacksMap");
        return null;
    }
}
