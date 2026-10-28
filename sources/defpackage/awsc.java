package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public interface awsc extends awsb {
    Object call(Object... objArr);

    Object callBy(Map map);

    List getParameters();

    awsk getReturnType();

    List getTypeParameters();

    awsl getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
