package defpackage;

import android.content.Context;
import android.graphics.Typeface;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'a' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class accx {
    public static final accx a;
    public static final accx b;
    public static final accx c;
    public static final accx d;
    public static final accx e;
    public static final accx f;
    public static final accx g;
    public static final accx h;
    private static final /* synthetic */ accx[] l;
    public final int i;
    public final accw j;
    public Typeface k;

    static {
        final String str = "fonts/MonoSerif-Regular.ttf";
        final int i = 0;
        accx accxVar = new accx("MONOSPACED_SERIF", 0, 0, new accw() { // from class: accv
            @Override // defpackage.accw
            public final Typeface a(Context context) {
                int i2 = i;
                if (i2 == 0) {
                    Object obj = str;
                    accx accxVar2 = accx.a;
                    return Typeface.createFromAsset(context.getAssets(), (String) obj);
                }
                if (i2 != 1) {
                    return ((ackm) str).c(context, 0);
                }
                accx accxVar3 = accx.a;
                return (Typeface) str;
            }
        });
        a = accxVar;
        final Typeface typefaceCreate = Typeface.create("serif", 0);
        final int i2 = 1;
        accx accxVar2 = new accx("PROPORTIONAL_SERIF", 1, 1, new accw() { // from class: accv
            @Override // defpackage.accw
            public final Typeface a(Context context) {
                int i3 = i2;
                if (i3 == 0) {
                    Object obj = typefaceCreate;
                    accx accxVar3 = accx.a;
                    return Typeface.createFromAsset(context.getAssets(), (String) obj);
                }
                if (i3 != 1) {
                    return ((ackm) typefaceCreate).c(context, 0);
                }
                accx accxVar4 = accx.a;
                return (Typeface) typefaceCreate;
            }
        });
        b = accxVar2;
        final Typeface typefaceCreate2 = Typeface.create("monospace", 0);
        final int i3 = 2;
        accx accxVar3 = new accx("MONOSPACED_SANS_SERIF", 2, 2, new accw() { // from class: accv
            @Override // defpackage.accw
            public final Typeface a(Context context) {
                int i4 = i2;
                if (i4 == 0) {
                    Object obj = typefaceCreate2;
                    accx accxVar4 = accx.a;
                    return Typeface.createFromAsset(context.getAssets(), (String) obj);
                }
                if (i4 != 1) {
                    return ((ackm) typefaceCreate2).c(context, 0);
                }
                accx accxVar5 = accx.a;
                return (Typeface) typefaceCreate2;
            }
        });
        c = accxVar3;
        final Typeface typefaceCreate3 = Typeface.create("sans-serif", 0);
        accx accxVar4 = new accx("PROPORTIONAL_SANS_SERIF", 3, 3, new accw() { // from class: accv
            @Override // defpackage.accw
            public final Typeface a(Context context) {
                int i4 = i2;
                if (i4 == 0) {
                    Object obj = typefaceCreate3;
                    accx accxVar5 = accx.a;
                    return Typeface.createFromAsset(context.getAssets(), (String) obj);
                }
                if (i4 != 1) {
                    return ((ackm) typefaceCreate3).c(context, 0);
                }
                accx accxVar6 = accx.a;
                return (Typeface) typefaceCreate3;
            }
        });
        d = accxVar4;
        final String str2 = "fonts/ComingSoon-Regular.ttf";
        accx accxVar5 = new accx("CASUAL", 4, 4, new accw() { // from class: accv
            @Override // defpackage.accw
            public final Typeface a(Context context) {
                int i4 = i;
                if (i4 == 0) {
                    Object obj = str2;
                    accx accxVar6 = accx.a;
                    return Typeface.createFromAsset(context.getAssets(), (String) obj);
                }
                if (i4 != 1) {
                    return ((ackm) str2).c(context, 0);
                }
                accx accxVar7 = accx.a;
                return (Typeface) str2;
            }
        });
        e = accxVar5;
        final String str3 = "fonts/DancingScript-Regular.ttf";
        accx accxVar6 = new accx("CURSIVE", 5, 5, new accw() { // from class: accv
            @Override // defpackage.accw
            public final Typeface a(Context context) {
                int i4 = i;
                if (i4 == 0) {
                    Object obj = str3;
                    accx accxVar7 = accx.a;
                    return Typeface.createFromAsset(context.getAssets(), (String) obj);
                }
                if (i4 != 1) {
                    return ((ackm) str3).c(context, 0);
                }
                accx accxVar8 = accx.a;
                return (Typeface) str3;
            }
        });
        f = accxVar6;
        final String str4 = "fonts/CarroisGothicSC-Regular.ttf";
        accx accxVar7 = new accx("SMALL_CAPITALS", 6, 6, new accw() { // from class: accv
            @Override // defpackage.accw
            public final Typeface a(Context context) {
                int i4 = i;
                if (i4 == 0) {
                    Object obj = str4;
                    accx accxVar8 = accx.a;
                    return Typeface.createFromAsset(context.getAssets(), (String) obj);
                }
                if (i4 != 1) {
                    return ((ackm) str4).c(context, 0);
                }
                accx accxVar9 = accx.a;
                return (Typeface) str4;
            }
        });
        g = accxVar7;
        final ackm ackmVar = ackm.ROBOTO_MEDIUM;
        accx accxVar8 = new accx("INLINE_MUTED", 7, 8, new accw() { // from class: accv
            @Override // defpackage.accw
            public final Typeface a(Context context) {
                int i4 = i3;
                if (i4 == 0) {
                    Object obj = ackmVar;
                    accx accxVar9 = accx.a;
                    return Typeface.createFromAsset(context.getAssets(), (String) obj);
                }
                if (i4 != 1) {
                    return ((ackm) ackmVar).c(context, 0);
                }
                accx accxVar10 = accx.a;
                return (Typeface) ackmVar;
            }
        });
        h = accxVar8;
        l = new accx[]{accxVar, accxVar2, accxVar3, accxVar4, accxVar5, accxVar6, accxVar7, accxVar8};
    }

    private accx(String str, int i, int i2, accw accwVar) {
        super(str, i);
        this.i = i2;
        this.j = accwVar;
    }

    public static accx[] values() {
        return (accx[]) l.clone();
    }
}
