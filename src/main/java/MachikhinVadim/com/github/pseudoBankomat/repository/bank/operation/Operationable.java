package MachikhinVadim.com.github.pseudoBankomat.repository.bank.operation;

import MachikhinVadim.com.github.pseudoBankomat.entity.Operation;
import MachikhinVadim.com.github.pseudoBankomat.exception.OperationException;

import java.time.LocalDate;
import java.util.List;

public interface Operationable {

    List<Operation> getOperationListByUserId(String userId, LocalDate beginningDate, LocalDate finishingDate) throws OperationException;
    void saveOperation(Operation operation);
}
