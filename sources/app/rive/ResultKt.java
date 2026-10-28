package app.rive;

import defpackage.awmj;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ResultKt {
    public static final Result sequence(Iterable iterable) {
        iterable.getClass();
        return sequenceResults(iterable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Result sequenceResults(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Result result = (Result) it.next();
            int iSwitchDispatch = ResultKt$$ExternalSyntheticTypeSwitchClass0.switchDispatch(result, 0);
            if (iSwitchDispatch == 0) {
                return Result.Loading.INSTANCE;
            }
            if (iSwitchDispatch == 1) {
                return result;
            }
            if (iSwitchDispatch != 2) {
                throw new awmj();
            }
            arrayList.add(((Result.Success) result).getValue());
        }
        return new Result.Success(arrayList);
    }
}
