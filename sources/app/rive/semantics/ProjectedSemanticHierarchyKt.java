package app.rive.semantics;

import defpackage.awno;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ProjectedSemanticHierarchyKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List toUnmodifiableList(Collection collection) {
        if (collection.isEmpty()) {
            return awno.a;
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(collection));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }
}
