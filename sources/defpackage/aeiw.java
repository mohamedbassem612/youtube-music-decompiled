package defpackage;

import android.accounts.Account;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aeiw implements agek {
    private final /* synthetic */ int $cid;

    public /* synthetic */ aeiw(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        switch (this.$cid) {
            case 0:
                return null;
            case 1:
                afhq afhqVar = ((afhn) obj).b;
                agrf agrfVar = aegn.a;
                return new Account(afhqVar.e, "com.google");
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Long.valueOf(((aeje) obj).d);
            case 6:
                aejf aejfVar = ((aeje) obj).c;
                if (aejfVar == null) {
                    aejfVar = aejf.a;
                }
                return Boolean.valueOf(aejfVar.d);
            case 7:
                aejf aejfVar2 = ((aeje) obj).c;
                if (aejfVar2 == null) {
                    aejfVar2 = aejf.a;
                }
                return aejfVar2.c;
            default:
                aeje aejeVar = (aeje) obj;
                aihf builder = aejeVar.toBuilder();
                aejf aejfVar3 = aejeVar.c;
                if (aejfVar3 == null) {
                    aejfVar3 = aejf.a;
                }
                aihf builder2 = aejfVar3.toBuilder();
                builder2.copyOnWrite();
                aejf aejfVar4 = (aejf) builder2.instance;
                aejfVar4.b |= 2;
                aejfVar4.d = true;
                builder.copyOnWrite();
                aeje aejeVar2 = (aeje) builder.instance;
                aejf aejfVar5 = (aejf) builder2.build();
                aejfVar5.getClass();
                aejeVar2.c = aejfVar5;
                aejeVar2.b |= 1;
                return (aeje) builder.build();
        }
    }
}
