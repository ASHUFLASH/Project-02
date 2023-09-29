document.addEventListener("DOMContentLoaded", function () {
    fetch("/api/questions")
        .then(response => response.json())
        .then(questions => {
            const quizContainer = document.getElementById("quiz-container");
            questions.forEach((question, index) => {
                const questionElement = document.createElement("div");
                questionElement.innerHTML = `
                    <p>${index + 1}. ${question.text}</p>
                    <input type="text" id="answer${index}">
                `;
                quizContainer.appendChild(questionElement);
            });
        });
});
