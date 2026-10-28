package defpackage;

import j$.util.DesugarCollections;
import java.io.File;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class agym implements agwu {
    @Override // defpackage.agwu
    public final Iterable b(Object obj) {
        File[] fileArrListFiles;
        File file = (File) obj;
        return (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) ? agpi.a : DesugarCollections.unmodifiableList(Arrays.asList(fileArrListFiles));
    }
}
