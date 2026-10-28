package defpackage;

import com.facebook.litho.ComponentTree;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fjn extends RuntimeException {
    public fip a;
    private final fhd e;
    private final ComponentTree f;
    public final ArrayList b = new ArrayList();
    private final List d = new ArrayList();
    public final HashMap c = new HashMap();

    public fjn(fhd fhdVar, ComponentTree componentTree, Throwable th) {
        initCause(th);
        setStackTrace(new StackTraceElement[0]);
        this.e = fhdVar;
        this.f = componentTree;
    }

    public final void a(String str) {
        this.b.add(str);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        Throwable cause = getCause();
        while (cause.getCause() != null) {
            cause = cause.getCause();
        }
        StringBuilder sb = new StringBuilder("Real Cause => ");
        sb.append(cause.getClass().getCanonicalName());
        sb.append(": ");
        sb.append(cause.getMessage());
        sb.append("\nLitho Context:\n");
        ArrayList arrayList = this.b;
        if (!arrayList.isEmpty()) {
            sb.append("  layout_stack: ");
            int size = arrayList.size() - 1;
            while (size >= 0) {
                sb.append((String) arrayList.get(size));
                int i = size - 1;
                if (i >= 0) {
                    List list = this.d;
                    if (i < list.size()) {
                        sb.append("[stateless=");
                        sb.append((String) list.get(i));
                        sb.append(']');
                    }
                }
                if (size != 0) {
                    sb.append(" -> ");
                }
                size = i;
            }
            sb.append('\n');
        }
        fhd fhdVar = this.e;
        if (fhdVar == null || fhdVar.n() == null) {
            ComponentTree componentTree = this.f;
            if (componentTree != null && (str = componentTree.E) != null) {
                sb.append("  log_tag: ");
                sb.append(str);
                sb.append('\n');
            }
        } else {
            sb.append("  log_tag: ");
            sb.append(fhdVar.n());
            sb.append('\n');
        }
        ComponentTree componentTree2 = this.f;
        if (componentTree2 == null) {
            componentTree2 = fhdVar != null ? fhdVar.g : null;
        }
        if (componentTree2 != null && componentTree2.b() != null) {
            sb.append("  tree_root: <cls>");
            sb.append(componentTree2.b().getClass().getName());
            sb.append("</cls>\n");
        }
        if (fhdVar != null && fhdVar.c != null) {
            sb.append("  component_scope: <cls>");
            sb.append(fhdVar.c.getClass().getName());
            sb.append("</cls>\n");
        }
        sb.append("  thread_name: ");
        sb.append(Thread.currentThread().getName());
        sb.append('\n');
        if (fhdVar != null && ((fhz) fhdVar.l(fhz.class)) != null) {
            throw null;
        }
        for (Map.Entry entry : this.c.entrySet()) {
            sb.append("  ");
            sb.append((String) entry.getKey());
            sb.append(": ");
            sb.append((String) entry.getValue());
            sb.append('\n');
        }
        return sb.toString().trim();
    }
}
