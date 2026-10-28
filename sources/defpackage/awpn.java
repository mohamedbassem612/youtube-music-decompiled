package defpackage;

import internal.org.jni_zero.JniZero;
import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awpn implements Serializable {
    private static final long serialVersionUID = 0;
    private final Class a;

    public awpn(Enum[] enumArr) {
        Class<?> componentType = enumArr.getClass().getComponentType();
        componentType.getClass();
        this.a = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.a.getEnumConstants();
        enumConstants.getClass();
        return JniZero.m((Enum[]) enumConstants);
    }
}
