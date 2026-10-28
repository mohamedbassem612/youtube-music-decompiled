package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aijs {
    private static volatile int a = 100;

    public static /* bridge */ /* synthetic */ void b(Object obj, int i, long j) {
        ((aijt) obj).f(i << 3, Long.valueOf(j));
    }

    public static aijt c(Object obj) {
        return ((aihn) obj).unknownFields;
    }

    public static aijt d(aijt aijtVar, aijt aijtVar2) {
        aijt aijtVar3 = aijt.a;
        if (aijtVar3.equals(aijtVar2)) {
            return aijtVar;
        }
        if (aijtVar3.equals(aijtVar)) {
            return aijt.b(aijtVar, aijtVar2);
        }
        if (aijtVar2.equals(aijtVar3)) {
            return aijtVar;
        }
        aijtVar.c();
        int i = aijtVar.b + aijtVar2.b;
        aijtVar.d(i);
        System.arraycopy(aijtVar2.c, 0, aijtVar.c, aijtVar.b, aijtVar2.b);
        System.arraycopy(aijtVar2.d, 0, aijtVar.d, aijtVar.b, aijtVar2.b);
        aijtVar.b = i;
        return aijtVar;
    }

    public static void e(Object obj, aijt aijtVar) {
        ((aihn) obj).unknownFields = aijtVar;
    }

    public static final aijt f(Object obj) {
        aihn aihnVar = (aihn) obj;
        aijt aijtVar = aihnVar.unknownFields;
        if (aijtVar != aijt.a) {
            return aijtVar;
        }
        aijt aijtVar2 = new aijt();
        aihnVar.unknownFields = aijtVar2;
        return aijtVar2;
    }

    public static final void g(Object obj) {
        ((aihn) obj).unknownFields.e();
    }

    final boolean a(Object obj, aign aignVar, int i) throws aiik {
        int i2 = aignVar.b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            b(obj, i3, aignVar.k());
            return true;
        }
        if (i4 == 1) {
            aijt aijtVar = (aijt) obj;
            aijtVar.f((i3 << 3) | 1, Long.valueOf(aignVar.j()));
            return true;
        }
        if (i4 == 2) {
            ((aijt) obj).f((i3 << 3) | 2, aignVar.o());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new aiik("Protocol message end-group tag did not match expected tag.");
            }
            if (i4 != 5) {
                throw new aiij("Protocol message tag had invalid wire type.");
            }
            ((aijt) obj).f((i3 << 3) | 5, Integer.valueOf(aignVar.e()));
            return true;
        }
        int i5 = i3 << 3;
        aijt aijtVar2 = new aijt();
        int i6 = i + 1;
        if (i6 >= a) {
            throw new aiik("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (aignVar.c() != Integer.MAX_VALUE && a(aijtVar2, aignVar, i6)) {
        }
        if ((i5 | 4) != aignVar.b) {
            throw new aiik("Protocol message end-group tag did not match expected tag.");
        }
        aijtVar2.e();
        ((aijt) obj).f(i5 | 3, aijtVar2);
        return true;
    }
}
