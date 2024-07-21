let saldo = 3000;

const elementoSaldo = document.querySelector(".saldo-valor .valor");
if(elementoSaldo){  
    elementoSaldo.textContent = saldo.toString();    
}


const elementoFormulario = document.querySelector(".block-nova-transacao form") as HTMLElement;

elementoFormulario.addEventListener("submit", function(event) {
    event.preventDefault();
    if (!elementoFormulario.checkValidity()) {
        alert("Por favor, preencha todos os campos da transação!");
        return;
    }

    const inputTipoTransacao = elementoFormulario.querySelector("#tipoTransacao") as HTMLSelectElement;
    const inputValor = elementoFormulario.querySelector("#valor")as HTMLInputElement;
    const inputData = elementoFormulario.querySelector("#data")as HTMLInputElement;

    let tipoTransacao : string =inputTipoTransacao.value;
    let valor: number = inputValor.valueAsNumber; 
    let data : Date = number = new Date(inputData.value);

    if (isNaN(valor) || valor <= 0) {
        alert("Por favor, insira um valor válido!");
        return;
    }

    if (tipoTransacao == "Depósito") {
        saldo += valor;
    } else if (tipoTransacao == "Transferência" || tipoTransacao == "Pagamento de Boleto") {
        saldo -= valor;
    } else {
        alert("Tipo de Transação inválido!");
        return;
    }

    elementoSaldo.textContent = saldo.toString(); // Formatar para duas casas decimais

    const novaTransacao = {
        tipoTransacao: tipoTransacao,
        valor: valor,
        data: data
    };

    console.log(novaTransacao);
    elementoFormulario.reset();
});
