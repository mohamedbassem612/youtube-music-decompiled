package app.rive.semantics;

import defpackage.awpl;
import defpackage.awqx;
import internal.org.jni_zero.JniZero;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum SemanticRole {
    None(0),
    Button(1),
    Link(2),
    Checkbox(3),
    SwitchControl(4),
    Slider(5),
    TextField(6),
    Text(7),
    Image(8),
    Group(9),
    List(10),
    ListItem(11),
    Tab(12),
    TabList(13),
    Dialog(14),
    AlertDialog(15),
    RadioGroup(16),
    RadioButton(17);

    private final int value;
    private static final /* synthetic */ awpl $ENTRIES = JniZero.m(values());
    public static final Companion Companion = new Companion(null);

    SemanticRole(int i) {
        this.value = i;
    }

    public static awpl getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        public final SemanticRole fromValue(int i) {
            Object next;
            Iterator<E> it = SemanticRole.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((SemanticRole) next).getValue() != i);
            SemanticRole semanticRole = (SemanticRole) next;
            return semanticRole == null ? SemanticRole.None : semanticRole;
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }
}
