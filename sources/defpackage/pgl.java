package defpackage;

import android.os.Bundle;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pgl extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ plx b;
    final /* synthetic */ aiff c;
    final /* synthetic */ String d;
    final /* synthetic */ pbh e;
    final /* synthetic */ List f;
    final /* synthetic */ int g;
    final /* synthetic */ int h;
    final /* synthetic */ int i;
    final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgl(List list, pfa pfaVar, plx plxVar, aiff aiffVar, String str, int i, int i2, pbh pbhVar, int i3, awoq awoqVar, int i4) {
        super(2, awoqVar);
        this.$cid = i4;
        this.f = list;
        this.j = pfaVar;
        this.b = plxVar;
        this.c = aiffVar;
        this.d = str;
        this.g = i;
        this.i = i2;
        this.e = pbhVar;
        this.h = i3;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        if (this.$cid == 0) {
            return new pgl((pgm) this.j, this.b, this.c, this.d, this.g, this.e, this.f, this.h, this.i, awoqVar, 0);
        }
        return new pgl(this.f, (pfa) this.j, this.b, this.c, this.d, this.g, this.i, this.e, this.h, awoqVar, 1);
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$cid != 0) {
            return ((pgl) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((pgl) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c5  */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.$cid == 0) {
            awox awoxVar = awox.a;
            int i = this.a;
            atqp.j(obj);
            if (i == 0) {
                Object obj2 = this.j;
                plx plxVar = this.b;
                aiff aiffVar = this.c;
                String str = this.d;
                int i2 = this.g;
                pbh pbhVar = this.e;
                List list = this.f;
                int i3 = this.h;
                int i4 = this.i;
                this.a = 1;
                if (((pgm) obj2).a.d(plxVar, aiffVar, str, i2, pbhVar, list, i3, i4, this) == awoxVar) {
                    return awoxVar;
                }
            }
            return awmy.a;
        }
        awox awoxVar2 = awox.a;
        int i5 = this.a;
        atqp.j(obj);
        if (i5 != 0) {
            return obj;
        }
        qpj.b();
        List<aicb> list2 = this.f;
        if (list2.isEmpty()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        pfa pfaVar = (pfa) this.j;
        long micros = TimeUnit.MILLISECONDS.toMicros(pfaVar.c.f().toEpochMilli());
        for (aicb aicbVar : list2) {
            aiff aiffVar2 = this.c;
            String str2 = this.d;
            int i6 = this.g;
            int i7 = this.i;
            pbh pbhVar2 = this.e;
            int i8 = this.h;
            aihf aihfVarCreateBuilder = pzo.a.createBuilder();
            aihfVarCreateBuilder.getClass();
            nra.g(aihfVarCreateBuilder);
            aicbVar.getClass();
            aihfVarCreateBuilder.copyOnWrite();
            pzo pzoVar = (pzo) aihfVarCreateBuilder.instance;
            pzoVar.a();
            pzoVar.c.add(aicbVar);
            nra.f(aiffVar2, aihfVarCreateBuilder);
            nra.d(str2, aihfVarCreateBuilder);
            if (i6 == 0) {
                throw null;
            }
            int i9 = i6 - 1;
            nra.i(i9 != 0 ? (i9 == 1 || i9 == 2) ? 3 : 4 : 2, aihfVarCreateBuilder);
            nra.j(i6 == 3 ? 4 : 3, aihfVarCreateBuilder);
            if (i7 == 0) {
                i7 = 7;
                if (!awrc.c(str2, "com.google.android.libraries.notifications.NOTIFICATION_SHOWN") && !awrc.c(str2, "com.google.android.libraries.notifications.NOTIFICATION_DROPPED")) {
                    pbhVar2.getClass();
                    ahza ahzaVar = pbhVar2.a;
                    if (ahzaVar != null) {
                        switch (ahzaVar) {
                            case REMOVE_REASON_UNKNOWN:
                                i7 = 1;
                                break;
                            case CLICKED_IN_SYSTEM_TRAY:
                            case ACTION_CLICK_IN_SYSTEM_TRAY:
                            case DISMISSED_IN_SYSTEM_TRAY:
                            case CLICKED_IN_INBOX:
                            case ACTION_CLICK_IN_INBOX:
                            case DISMISSED_IN_INBOX:
                            case USER_FEEDBACK_ACTION_CLICK:
                                i7 = 2;
                                break;
                            case DISMISSED_REMOTE:
                            case ACCOUNT_DATA_CLEANED:
                                i7 = 5;
                                break;
                            case DISMISSED_BY_API:
                                i7 = 6;
                                break;
                            case EXPIRED:
                                i7 = 4;
                                break;
                            case LIMIT_REACHED:
                                i7 = 3;
                                break;
                            case CHANNEL_OPT_OUT:
                            case CHANNEL_GROUP_OPT_OUT:
                            case GLOBAL_APP_OPT_OUT:
                                i7 = 8;
                                break;
                            case UNKNOWN_REASON:
                                i7 = 9;
                                break;
                            default:
                                throw new awmj();
                        }
                    } else {
                        i7 = 1;
                    }
                }
            }
            nra.k(i7, aihfVarCreateBuilder);
            nra.e(micros, aihfVarCreateBuilder);
            if (i8 != 0) {
                nra.h(1, aihfVarCreateBuilder);
            }
            pfaVar.b.a(this.b, 100, nra.c(aihfVarCreateBuilder).toByteArray());
        }
        Bundle bundle = new Bundle();
        plx plxVar2 = this.b;
        nvi.b(bundle, plxVar2);
        aunn aunnVar = pfaVar.k;
        aunn aunnVar2 = pfaVar.g;
        Long l = new Long(5000L);
        this.a = 1;
        Object objE = pfaVar.e(plxVar2, 100, aunnVar, aunnVar2, bundle, l, this);
        return objE == awoxVar2 ? awoxVar2 : objE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgl(pgm pgmVar, plx plxVar, aiff aiffVar, String str, int i, pbh pbhVar, List list, int i2, int i3, awoq awoqVar, int i4) {
        super(2, awoqVar);
        this.$cid = i4;
        this.j = pgmVar;
        this.b = plxVar;
        this.c = aiffVar;
        this.d = str;
        this.g = i;
        this.e = pbhVar;
        this.f = list;
        this.h = i2;
        this.i = i3;
    }
}
