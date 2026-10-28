package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eoc {
    public static final /* synthetic */ int a = 0;

    static {
        int i = eod.a;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + ':' + ahno.Z(exc.getMessage());
            int i = eov.a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            eov.f("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static ainy b(int i, int i2, eoh eohVar) {
        return c(i, i2, eohVar, null, aioc.BROADCAST_ACTION_UNSPECIFIED);
    }

    public static ainy c(int i, int i2, eoh eohVar, String str, aioc aiocVar) {
        try {
            aihf aihfVarCreateBuilder = aioa.a.createBuilder();
            int i3 = eohVar.a;
            aihfVarCreateBuilder.copyOnWrite();
            aioa aioaVar = (aioa) aihfVarCreateBuilder.instance;
            aioaVar.b |= 1;
            aioaVar.c = i3;
            String str2 = eohVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            aioa aioaVar2 = (aioa) aihfVarCreateBuilder.instance;
            str2.getClass();
            aioaVar2.b |= 2;
            aioaVar2.d = str2;
            int i4 = eohVar.b;
            if (i4 != 0) {
                aihfVarCreateBuilder.copyOnWrite();
                aioa aioaVar3 = (aioa) aihfVarCreateBuilder.instance;
                aioaVar3.b |= 16;
                aioaVar3.g = i4;
            }
            if (i != 0) {
                aihfVarCreateBuilder.copyOnWrite();
                aioa aioaVar4 = (aioa) aihfVarCreateBuilder.instance;
                aioaVar4.e = i - 1;
                aioaVar4.b |= 4;
            }
            if (str != null) {
                aihfVarCreateBuilder.copyOnWrite();
                aioa aioaVar5 = (aioa) aihfVarCreateBuilder.instance;
                aioaVar5.b |= 8;
                aioaVar5.f = str;
            }
            aihf aihfVarCreateBuilder2 = ainy.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            ainy ainyVar = (ainy) aihfVarCreateBuilder2.instance;
            aioa aioaVar6 = (aioa) aihfVarCreateBuilder.build();
            aioaVar6.getClass();
            ainyVar.f = aioaVar6;
            ainyVar.b |= 2;
            aihfVarCreateBuilder2.copyOnWrite();
            ainy ainyVar2 = (ainy) aihfVarCreateBuilder2.instance;
            ainyVar2.e = i2 - 1;
            ainyVar2.b |= 1;
            if (!aiocVar.equals(aioc.BROADCAST_ACTION_UNSPECIFIED)) {
                aihfVarCreateBuilder2.copyOnWrite();
                ainy ainyVar3 = (ainy) aihfVarCreateBuilder2.instance;
                ainyVar3.g = aiocVar.g;
                ainyVar3.b |= 4;
            }
            return (ainy) aihfVarCreateBuilder2.build();
        } catch (Throwable th) {
            eov.f("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static ainz d(int i) {
        return e(i, aioc.BROADCAST_ACTION_UNSPECIFIED);
    }

    public static ainz e(int i, aioc aiocVar) {
        try {
            aihf aihfVarCreateBuilder = ainz.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            ainz ainzVar = (ainz) aihfVarCreateBuilder.instance;
            ainzVar.e = i - 1;
            ainzVar.b |= 1;
            if (!aiocVar.equals(aioc.BROADCAST_ACTION_UNSPECIFIED)) {
                aihfVarCreateBuilder.copyOnWrite();
                ainz ainzVar2 = (ainz) aihfVarCreateBuilder.instance;
                ainzVar2.f = aiocVar.g;
                ainzVar2.b |= 2;
            }
            return (ainz) aihfVarCreateBuilder.build();
        } catch (Exception e) {
            eov.f("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
