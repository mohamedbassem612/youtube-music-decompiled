package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface sdn {
    aixg a() default aixg.LAYOUT_TYPE_UNSPECIFIED;

    aixo b() default aixo.SLOT_TYPE_UNSPECIFIED;

    Class[] c() default {};

    Class[] d() default {};
}
