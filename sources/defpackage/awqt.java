package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class awqt implements Serializable, awsc {
    public static final Object NO_RECEIVER = awqs.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient awsc reflected;
    private final String signature;

    protected awqt(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.awsc
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.awsc
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public awsc compute() {
        awsc awscVar = this.reflected;
        if (awscVar != null) {
            return awscVar;
        }
        awsc awscVarComputeReflected = computeReflected();
        this.reflected = awscVarComputeReflected;
        return awscVarComputeReflected;
    }

    protected abstract awsc computeReflected();

    public GenericDeclaration findJavaDeclaration() throws IOException {
        String strSubstring;
        awse owner = getOwner();
        String signature = getSignature();
        signature.getClass();
        if (!(owner instanceof awqu)) {
            return null;
        }
        int iIndexOf = signature.indexOf(40, 0);
        if (iIndexOf == -1) {
            strSubstring = signature;
        } else {
            strSubstring = signature.substring(0, iIndexOf);
            strSubstring.getClass();
        }
        if (awrc.c(strSubstring, "<init>")) {
            throw new UnsupportedOperationException("Generic Java constructors are not supported: " + owner + '/' + signature);
        }
        Method[] declaredMethods = ((awqu) owner).a().getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            if (awrc.c(method.getName(), strSubstring)) {
                method.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append(method.getName());
                sb.append('(');
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                for (Class<?> cls : parameterTypes) {
                    cls.getClass();
                    avkz.i(sb, cls);
                }
                sb.append(')');
                Class<?> returnType = method.getReturnType();
                returnType.getClass();
                avkz.i(sb, returnType);
                if (awrc.c(sb.toString(), signature)) {
                    return method;
                }
            }
        }
        return null;
    }

    @Override // defpackage.awsb
    public List getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public awse getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            int i = awrn.a;
            return new awrd(cls);
        }
        int i2 = awrn.a;
        return new awqv(cls);
    }

    @Override // defpackage.awsc
    public List getParameters() {
        return getReflected().getParameters();
    }

    protected awsc getReflected() {
        awsc awscVarCompute = compute();
        if (awscVarCompute != this) {
            return awscVarCompute;
        }
        throw new awpv();
    }

    @Override // defpackage.awsc
    public awsk getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.awsc
    public List getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.awsc
    public awsl getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.awsc
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.awsc
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.awsc
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // defpackage.awsc
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public awqt() {
        this(NO_RECEIVER);
    }

    protected awqt(Object obj) {
        this(obj, null, null, null, false);
    }
}
