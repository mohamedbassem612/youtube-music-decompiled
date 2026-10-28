package app.rive;

import defpackage.ahk;
import defpackage.awmj;
import defpackage.awml;
import defpackage.awqg;
import defpackage.awqk;
import defpackage.awql;
import defpackage.awrc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public interface Result {
    Result andThen(Result result, awql awqlVar, ahk ahkVar, int i);

    Result andThen(awql awqlVar, ahk ahkVar, int i);

    Result map(awqg awqgVar);

    Result sequence(Iterable iterable);

    Result zip(Result result);

    Result zip(Result result, Result result2);

    Result zip(Result result, Result result2, awqk awqkVar);

    Result zip(Result result, awqk awqkVar);

    /* JADX INFO: compiled from: PG */
    public final class Error implements Result {
        public static final int $stable = 8;
        private final Throwable throwable;

        public Error(Throwable th) {
            th.getClass();
            this.throwable = th;
        }

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        @Override // app.rive.Result
        public /* synthetic */ Result andThen(Result result, awql awqlVar, ahk ahkVar, int i) {
            return CC.$default$andThen(this, result, awqlVar, ahkVar, i);
        }

        public final Throwable component1() {
            return this.throwable;
        }

        public final Error copy(Throwable th) {
            th.getClass();
            return new Error(th);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Error) && awrc.c(this.throwable, ((Error) obj).throwable);
            }
            return true;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        @Override // app.rive.Result
        public /* synthetic */ Result map(awqg awqgVar) {
            return CC.$default$map(this, awqgVar);
        }

        @Override // app.rive.Result
        public /* synthetic */ Result sequence(Iterable iterable) {
            return CC.$default$sequence(this, iterable);
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ')';
        }

        @Override // app.rive.Result
        public /* synthetic */ Result zip(Result result) {
            return CC.$default$zip(this, result);
        }

        @Override // app.rive.Result
        public /* synthetic */ Result andThen(awql awqlVar, ahk ahkVar, int i) {
            return CC.$default$andThen(this, awqlVar, ahkVar, i);
        }

        @Override // app.rive.Result
        public /* synthetic */ Result zip(Result result, Result result2) {
            return CC.$default$zip(this, result, result2);
        }

        @Override // app.rive.Result
        public /* synthetic */ Result zip(Result result, Result result2, awqk awqkVar) {
            return CC.$default$zip(this, result, result2, awqkVar);
        }

        @Override // app.rive.Result
        public /* synthetic */ Result zip(Result result, awqk awqkVar) {
            return CC.$default$zip(this, result, awqkVar);
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class Loading implements Result {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        @Override // app.rive.Result
        public /* synthetic */ Result andThen(Result result, awql awqlVar, ahk ahkVar, int i) {
            return CC.$default$andThen(this, result, awqlVar, ahkVar, i);
        }

        @Override // app.rive.Result
        public /* synthetic */ Result map(awqg awqgVar) {
            return CC.$default$map(this, awqgVar);
        }

        @Override // app.rive.Result
        public /* synthetic */ Result sequence(Iterable iterable) {
            return CC.$default$sequence(this, iterable);
        }

        @Override // app.rive.Result
        public /* synthetic */ Result zip(Result result) {
            return CC.$default$zip(this, result);
        }

        @Override // app.rive.Result
        public /* synthetic */ Result andThen(awql awqlVar, ahk ahkVar, int i) {
            return CC.$default$andThen(this, awqlVar, ahkVar, i);
        }

        @Override // app.rive.Result
        public /* synthetic */ Result zip(Result result, Result result2) {
            return CC.$default$zip(this, result, result2);
        }

        @Override // app.rive.Result
        public /* synthetic */ Result zip(Result result, Result result2, awqk awqkVar) {
            return CC.$default$zip(this, result, result2, awqkVar);
        }

        @Override // app.rive.Result
        public /* synthetic */ Result zip(Result result, awqk awqkVar) {
            return CC.$default$zip(this, result, awqkVar);
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class Success implements Result {
        public static final int $stable = 0;
        private final Object value;

        public Success(Object obj) {
            this.value = obj;
        }

        public static /* synthetic */ Success copy$default(Success success, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = success.value;
            }
            return success.copy(obj);
        }

        @Override // app.rive.Result
        public /* synthetic */ Result andThen(Result result, awql awqlVar, ahk ahkVar, int i) {
            return CC.$default$andThen(this, result, awqlVar, ahkVar, i);
        }

        public final Object component1() {
            return this.value;
        }

        public final Success copy(Object obj) {
            return new Success(obj);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Success) && awrc.c(this.value, ((Success) obj).value);
            }
            return true;
        }

        public final Object getValue() {
            return this.value;
        }

        public int hashCode() {
            Object obj = this.value;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // app.rive.Result
        public /* synthetic */ Result map(awqg awqgVar) {
            return CC.$default$map(this, awqgVar);
        }

        @Override // app.rive.Result
        public /* synthetic */ Result sequence(Iterable iterable) {
            return CC.$default$sequence(this, iterable);
        }

        public String toString() {
            return "Success(value=" + this.value + ')';
        }

        @Override // app.rive.Result
        public /* synthetic */ Result zip(Result result) {
            return CC.$default$zip(this, result);
        }

        @Override // app.rive.Result
        public /* synthetic */ Result andThen(awql awqlVar, ahk ahkVar, int i) {
            return CC.$default$andThen(this, awqlVar, ahkVar, i);
        }

        @Override // app.rive.Result
        public /* synthetic */ Result zip(Result result, Result result2) {
            return CC.$default$zip(this, result, result2);
        }

        @Override // app.rive.Result
        public /* synthetic */ Result zip(Result result, Result result2, awqk awqkVar) {
            return CC.$default$zip(this, result, result2, awqkVar);
        }

        @Override // app.rive.Result
        public /* synthetic */ Result zip(Result result, awqk awqkVar) {
            return CC.$default$zip(this, result, awqkVar);
        }
    }

    /* JADX INFO: renamed from: app.rive.Result$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    public final /* synthetic */ class CC {
        public static Result $default$andThen(Result result, awql awqlVar, ahk ahkVar, int i) {
            awqlVar.getClass();
            ahkVar.A();
            int iSwitchDispatch = Result$$ExternalSyntheticTypeSwitchClass1.switchDispatch(result, 0);
            if (iSwitchDispatch == 0) {
                ahkVar.A();
                ahkVar.h();
                result = Loading.INSTANCE;
            } else if (iSwitchDispatch == 1) {
                ahkVar.A();
                ahkVar.h();
            } else {
                if (iSwitchDispatch != 2) {
                    ahkVar.A();
                    ahkVar.h();
                    throw new awmj();
                }
                ahkVar.A();
                result = (Result) awqlVar.invoke(((Success) result).getValue(), ahkVar, Integer.valueOf((i << 3) & 112));
                ahkVar.h();
            }
            ahkVar.h();
            return result;
        }

        public static Result $default$map(Result result, awqg awqgVar) {
            awqgVar.getClass();
            int iSwitchDispatch = Result$$ExternalSyntheticTypeSwitchClass1.switchDispatch(result, 0);
            if (iSwitchDispatch == 0) {
                return Loading.INSTANCE;
            }
            if (iSwitchDispatch == 1) {
                return result;
            }
            if (iSwitchDispatch == 2) {
                return new Success(awqgVar.invoke(((Success) result).getValue()));
            }
            throw new awmj();
        }

        public static Result $default$sequence(Result result, Iterable iterable) {
            iterable.getClass();
            return ResultKt.sequenceResults(iterable);
        }

        public static Result $default$zip(Result result, Result result2, awqk awqkVar) {
            result2.getClass();
            awqkVar.getClass();
            int iSwitchDispatch = Result$$ExternalSyntheticTypeSwitchClass1.switchDispatch(result, 0);
            if (iSwitchDispatch != 0) {
                if (iSwitchDispatch == 1) {
                    return result;
                }
                if (iSwitchDispatch != 2) {
                    throw new awmj();
                }
                int iSwitchDispatch2 = Result$$ExternalSyntheticTypeSwitchClass1.switchDispatch(result2, 0);
                if (iSwitchDispatch2 != 0) {
                    if (iSwitchDispatch2 == 1) {
                        return result2;
                    }
                    if (iSwitchDispatch2 == 2) {
                        return new Success(awqkVar.invoke(((Success) result).getValue(), ((Success) result2).getValue()));
                    }
                    throw new awmj();
                }
            }
            return Loading.INSTANCE;
        }

        public static awml zip$lambda$0(Object obj, Object obj2) {
            return new awml(obj, obj2);
        }

        public static Result $default$zip(Result result, Result result2, Result result3) {
            result2.getClass();
            result3.getClass();
            return result2.zip(result3);
        }

        public static Result $default$zip(Result result, Result result2, Result result3, awqk awqkVar) {
            result2.getClass();
            result3.getClass();
            awqkVar.getClass();
            return result2.zip(result3, awqkVar);
        }

        public static Result $default$zip(Result result, Result result2) {
            result2.getClass();
            return result.zip(result2, new awqk() { // from class: app.rive.Result$$ExternalSyntheticLambda0
                @Override // defpackage.awqk
                public final Object invoke(Object obj, Object obj2) {
                    return Result.CC.zip$lambda$0(obj, obj2);
                }
            });
        }

        public static Result $default$andThen(Result result, Result result2, awql awqlVar, ahk ahkVar, int i) {
            result2.getClass();
            awqlVar.getClass();
            ahkVar.A();
            Result resultAndThen = result2.andThen(awqlVar, ahkVar, ((i >> 3) & 14) | ((i << 3) & 112));
            ahkVar.h();
            return resultAndThen;
        }
    }
}
